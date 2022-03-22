package com.yj.auto.slave.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdateSlave {

    @NotNull
    private Long id;

    private String name;

    private String ip;

    private String token;

    private String owner;

    private String password;

}
