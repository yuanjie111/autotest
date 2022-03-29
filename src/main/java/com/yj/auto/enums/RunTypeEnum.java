package com.yj.auto.enums;

import lombok.Getter;

@Getter
public enum RunTypeEnum {
    NORMAL_TASK(0,"普通任务"),
    SCHEDULED_TASK(1,"定时任务");

    private Integer code;
    private String desc;

    RunTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
