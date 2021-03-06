package com.gary.ym.enums;

import lombok.Getter;

/**
 * Created by Guo on 2018/1/3.
 */

@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
