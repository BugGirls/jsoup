package com.hndt.enums;

import lombok.Getter;

/**
 * 留学在线
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum LiuXueZaiXianEnum {

    /**
     * 留学快讯
     */
    LIUXUEKUAIXUN(1308, "/liuxuezaixian/liuxuekuaixun/"),

    /**
     * 留学答疑
     */
    JUJIAOHAIGUI(1309, "/liuxuezaixian/jujiaohaigui/"),

    /**
     * 聚焦海归
     */
    YIMINHAIWAI(1310, "/liuxuezaixian/yiminhaiwai/"),

    ;

    private Integer code;
    private String value;

    LiuXueZaiXianEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
