package com.tuya.topfunc.core.func;

import com.google.common.base.Ascii;
import com.google.common.base.Strings;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

/**
 * 要求其中所有的函数，尽量是纯函数。
 * 对性能敏感、或者内存敏感的，有些方法不要用。
 */
public interface TextFunc extends ObjectFunc {

    char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

/*    default boolean isNullOrEmpty(String text) {
        return !StringUtils.hasText(text);
    }*/

    default String padStart(String str, int len, char padding) {
        return Strings.padStart(str, len, padding);
    }

    default String padEnd(String str, int len, char padding) {
        return Strings.padStart(str, len, padding);
    }

    default String repeat(String str, int times) {
        return Strings.repeat(str, times);
    }

    default String sha512(CharSequence input) {
        return Hashing.sha512().hashString(input, StandardCharsets.UTF_8).toString();
    }

    default String sha512(byte[] input) {
        return Hashing.sha512().hashBytes(input).toString();
    }

    default String format(String str, Object... args) {
        return Strings.lenientFormat(str, args);
    }

    default String truncate(CharSequence seq, int maxLength, String truncationIndicator) {
        return Ascii.truncate(seq, maxLength, truncationIndicator);
    }

    default String hex(byte[] buf){
        char[] charArray = new char[buf.length*2];
        int j = 0;
        for(int i=0;i<buf.length;i++){
            charArray[j++] = HEX_CHARS[buf[i]>>>4 & 0x0F];
            //先取高4位，再取低4位
            charArray[j++] = HEX_CHARS[buf[i] & 0x0F];
        }
        return new String(charArray);
    }
}
