package com.tuya.connector.ability.countrycode.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class Country {

    /**
     * 国家码
     */
    String country_code;

    /**
     * 国家区号
     */
    String national_number;

    /**
     * 国家名称
     */
    String country_name;

    /**
     * 国家的拼音
     */
    String country_phonetic_alphabet;

}
