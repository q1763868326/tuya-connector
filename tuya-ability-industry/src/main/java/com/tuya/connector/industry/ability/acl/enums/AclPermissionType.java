package com.tuya.connector.industry.ability.acl.enums;

import lombok.Getter;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/31
 */
@Getter
public enum AclPermissionType {
    api(1),menu(2),button(3),data(4);
    private int code;
    public static AclPermissionType fromCode(int code){
        AclPermissionType[] values = values();
        for(AclPermissionType it: values){
            if(it.code == code){
                return it;
            }
        }
        return null;
    }
    AclPermissionType(int c){
        code = c;
    }
}
