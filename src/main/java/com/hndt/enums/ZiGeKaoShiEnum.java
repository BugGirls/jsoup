package com.hndt.enums;

import lombok.Getter;

/**
 * 资格考试
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum ZiGeKaoShiEnum {

    /**
     * 资考快讯
     */
    ZIKAOKUAIXUN(1312, "/zigekaoshi/zikaokuaixun/"),

    /**
     * 资考答疑
     */
    ZHENGSHUCHAXUN(1313, "/zigekaoshi/zhengshuchaxun/"),;

    private Integer code;
    private String value;

    ZiGeKaoShiEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
