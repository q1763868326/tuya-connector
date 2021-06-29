package com.tuya.connector.industry.ability;


import com.tuya.connector.industry.ability.user.connector.UserConnector;
import com.tuya.connector.industry.ability.user.model.PasswordReset;
import com.tuya.connector.industry.ability.user.model.UserRegister;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class UserConnectorTest extends BaseTest {
    UserConnector connector = loadConnector(UserConnector.class);

    @Test
    public void testPasswordReset() {
        val passwordReset = PasswordReset.builder()
                .username(username())
                .newPassword(password())
                .build();
        println(connector.resetPassword(passwordReset));
    }

    @Test
    public void testUserRegistry() {
        val res = connector.registerUser(UserRegister.builder()
                .countryCode("86")
                .nickName("benguan.zhou")
                .username(username())
                .password(password())
                .build());
        println(res);
    }
    @Test
    public void testSelectUser() {
        val res = connector.queryUserByUid(uid());
        println(res);
    }
}
