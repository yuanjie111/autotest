package com.yj.auto.enums;

import lombok.Getter;

@Getter
public enum MobileReadyState {
    NOT_AVAILABLE(0,"不可用"),
    ONLINE(1,"在线可用"),
    OFFLINE(2,"已下线");

    private Integer code;
    private String desc;

    MobileReadyState(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
