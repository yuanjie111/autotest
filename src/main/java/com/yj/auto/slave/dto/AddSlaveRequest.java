package com.yj.auto.slave.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddSlaveRequest {
    @NotNull
    private String name;
    @NotNull
    private String ip;

    private String token;

    private String owner;

    private String password;

}
