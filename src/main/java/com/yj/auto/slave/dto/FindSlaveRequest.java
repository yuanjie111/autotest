package com.yj.auto.slave.dto;

import com.yj.auto.common.PageRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class FindSlaveRequest extends PageRequest {

    private String name;

    private String ip;

    private String token;

    private String owner;

    private String password;

}
