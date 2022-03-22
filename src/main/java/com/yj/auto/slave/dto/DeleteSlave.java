package com.yj.auto.slave.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DeleteSlave {

    @NotNull
    private Long id;

}
