package com.yj.auto.enums;

import lombok.Getter;

@Getter
public enum ExecuteStatus {
    IN_EXECUTION(0,"执行中"),
    WAITING(1,"待执行"),
    COMPLETE(2,"执行完成");

    private Integer code;
    private String desc;

    ExecuteStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
