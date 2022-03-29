package com.yj.auto.enums;

import lombok.Getter;

@Getter
public enum BuildTypeEnum {
    DEBUG(0,"debug"),
    RELEASE(1,"release");

    private Integer code;
    private String desc;

    BuildTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
