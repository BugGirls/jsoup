package com.hndt.enums;

import lombok.Getter;

/**
 * 资源投诉
 *
 * @author Hystar
 * @date 2019/2/15
 */
@Getter
public enum ZiXunTouSu {

    /**
     * 资源投诉
     */
    ZHAOKAOZIXUN(1280, "/zhaokaozixun/");


    private Integer code;
    private String value;

    ZiXunTouSu(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
