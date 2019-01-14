package com.hndt.enums;

import lombok.Getter;

/**
 * 公务员招考
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum GongWuYuanZhaoKaoEnum {

    /**
     * 公考快讯
     */
    GONGKAOKUAIXUN(1304, "/gongwuyuanzhaokao/gongkaokuaixun/"),

    /**
     * 招聘信息
     */
    ZHAOPINXINXI(1305, "/gongwuyuanzhaokao/zhaopinxinxi/"),

    /**
     * 备考指南
     */
    ZHENGCEFAGUI(1306, "/gongwuyuanzhaokao/zhengcefagui/"),

    ;

    private Integer code;
    private String value;

    GongWuYuanZhaoKaoEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
