# 包组织说明
所有的ability，都在com.tuya.connector.ability包中

有些ability具有共同的主题，建议放到相同的子包中。

后续可能有些ability在多个维度有共同的主题，这个问题后面遇到再说（重构）。

eg:
```
--com.tuya.connector.ability
    --acl
        --connector
            --AclRoleConnector
        --model
            --AclRole
            --AclRoleQueryParam
            --
    asset
        --connector
        --model
...
```
# model类的命名策略
- 策略一

所有参数类以Param（或者其他后缀）结尾
  
所有结果类以Res(或者其他后缀)结尾

然后如果某个Param/Res对应到某个领域概念，则创建对应的model，让Param/Res继承它

- 策略二

一般请求参数加Param后缀
  
一般响应结果加Res后缀（Result的缩写）

但是， 如果可以对应到某个领域概念的，不加Param/Res后缀
  
- 策略三

所有请求参数或者响应结果都加Pack后缀

但是， 如果可以对应到某个领域概念的，不加Pack后缀

- 策略四 
  
所有请求参数或者响应结果都不加后缀
...
  
本项目采用策略四

todo
- 根据connector自动生成ability
- 属性名命名风格统一，全部转驼峰
acl包下的属性名，如果不全为小写，则添加@Serialized("对应的下划线风格的名称")
  
- model类统一加上lombok注解五件套
- connector 添加类注释，方法注释


