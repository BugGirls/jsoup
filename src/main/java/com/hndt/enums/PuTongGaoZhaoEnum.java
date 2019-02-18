package com.hndt.enums;

import lombok.Getter;

/**
 * 普通高招
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum PuTongGaoZhaoEnum {

    /**
     * 高招快报
     */
//    GAOZHAOKUAIBAO(1293, "/putonggaozhao/gaozhaokuaibao/"),

    /**
     * 高校招考
     */
//    GAOZHAOKUAIXUN(1294, "/putonggaozhao/gaozhaokuaixun/"),

    /**
     * 志愿填报
     */
    ZHIYUANTIANBAO(1295, "/putonggaozhao/zhiyuantianbao/"),

    /**
     * 我心从容
     */
    KAOQIANXINLITIAOSHI(1296, "/putonggaozhao/kaoqianxinlitiaoshi/")
    ;

    private Integer code;
    private String value;

    PuTongGaoZhaoEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

}
