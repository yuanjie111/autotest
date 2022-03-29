package com.yj.auto.enums;

import lombok.Getter;

@Getter
public enum MobilePlatform {
    ALL(0,"所有系统"),
    ANDROID(1,"android"),
    IOS(2,"ios");

    private Integer code;
    private String desc;

    MobilePlatform(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
