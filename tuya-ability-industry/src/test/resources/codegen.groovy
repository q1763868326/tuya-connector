import groovy.io.FileType

def userDir = System.getProperty('user.dir')
def moduleRoot = new File(userDir)
while(moduleRoot.path.contains('src')){
    moduleRoot = moduleRoot.getParentFile()
}
println moduleRoot

new File(moduleRoot,'src/main/java').eachFileRecurse(FileType.FILES){
    if(it.name.endsWith('Connector.java')){
        def abilityDir = new File(it.parentFile.parentFile,'ability')
        if(!abilityDir.exists()){
            abilityDir.mkdirs()
        }
        def connectorText = it.text
        def connectorName = it.name.split(/\./)[0]
        def abilityName = connectorName.replace('Connector','Ability')
        def abilityPkgName = (abilityDir.absolutePath-moduleRoot.absolutePath-'/src/main/java')
                .replaceAll('/','.')
        def ability = new File(abilityDir,abilityName+'.java')
        if(!ability.exists()){
            ability.text = it.text
            ability.text = ability.text.split(/\n/)
            .findAll{
                !it.matches(/^.*(@GET|@PUT|@POST|@DELETE).*$/)
            }.join('\n')
            boolean importedAbility = false
            it.text = it.text.split(/\n/).collect{
                if(it.startsWith('import') && !importedAbility){
                    importedAbility = true
                    "import ${abilityPkgName}.${abilityName};\n${it}"
                }else if(it.matches(/^.*(@GET|@PUT|@POST|@DELETE).*$/)){
                    "${it}\n@Override\n"
                }else if(it.contains(connectorName)){
                    def parts = it.split(connectorName)
                    parts[0..-2]+["$connectorName extends $abilityName"]+parts[-2..-1]
                }else{
                    it
                }
            }
        }
    }
}