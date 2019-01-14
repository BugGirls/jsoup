package com.hndt.enums;

import lombok.Getter;

/**
 * 自考及成人高招
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum ZiKaoJiChengRenGaoZhaoEnum {

    /**
     * 招录快讯
     */
    ZHAO(1300, "/zikaojichengrengaozhao/zhao/"),

    /**
     * 考试必备
     */
    SHITIJIJIN(1301, "/zikaojichengrengaozhao/shitijijin/"),;

    private Integer code;
    private String value;

    ZiKaoJiChengRenGaoZhaoEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
