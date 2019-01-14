package com.hndt.enums;

import lombok.Getter;

/**
 * 考试培训
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum KaoShiPeiXunEnum {

    /**
     * 研招培训
     */
    YANZHAOPEIXUN(1328, "/kaoshipeixun/yanzhaopeixun/"),

    /**
     * 公务员培训
     */
    GONGWUYUANKAOSHIPEIXUN(1329, "/kaoshipeixun/gongwuyuankaoshipeixun/"),

    /**
     * 资考培训
     */
    ZIKAOFUDAO(1330, "/kaoshipeixun/zikaofudao/"),

    /**
     * 综合培训
     */
    ZHENGJIANBANLIZHINAN(1331, "/kaoshipeixun/zhengjianbanlizhinan/"),

    ;

    private Integer code;
    private String value;

    KaoShiPeiXunEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
