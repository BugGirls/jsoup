package com.hndt.enums;

import lombok.Getter;

/**
 * 中考招生
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum ZhongKaoZhaoShengEnum {

    /**
     * 中招快讯
     */
    ZHONGZHAOKUAIXUN(1297, "/zhongkaozhaosheng/zhongzhaokuaixun/"),

    /**
     * 心语航标
     */
    KAOQIANXINLITIAOSHI(1298, "/zhongkaozhaosheng/kaoqianxinlitiaoshi/"),;

    private Integer code;
    private String value;

    ZhongKaoZhaoShengEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
