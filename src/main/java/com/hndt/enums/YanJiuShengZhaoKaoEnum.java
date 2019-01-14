package com.hndt.enums;

import lombok.Getter;

/**
 * 研究生招考
 *
 * @author Hystar
 * @date 2019/1/8
 */
@Getter
public enum YanJiuShengZhaoKaoEnum {

    /**
     * 研招快讯
     */
    ZHAOLUKUAIBAO(1302, "/yanjiushengzhaokao/zhaolukuaibao/"),

    /**
     * 考研辅导
     */
    CHENGRENGAOZHAODANWEI(1303, "/yanjiushengzhaokao/chengrengaozhaodanwei/"),;

    private Integer code;
    private String value;

    YanJiuShengZhaoKaoEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
