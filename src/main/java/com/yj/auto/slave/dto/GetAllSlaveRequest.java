package com.yj.auto.slave.dto;

import lombok.Data;


@Data
public class GetAllSlaveRequest {

    private Integer pageNum=1;

    private Integer pageSize=10;

}
