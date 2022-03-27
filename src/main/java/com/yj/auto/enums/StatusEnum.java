package com.yj.auto.enums;

import lombok.Getter;

@Getter
public enum StatusEnum {
    //
    VALID(0,"无效"),
    INVALID(1,"有效");

    private final Integer code;
    private final String desc;

    StatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
