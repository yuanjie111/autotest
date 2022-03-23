package com.yj.auto.slave.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddSlaveRequest {
    @NotNull(message = "name不能为空")
    private String name;
    @NotNull(message = "ip不能为空")
    private String ip;

    private String token;

    private String owner;

    private String password;

}
