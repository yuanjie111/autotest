package com.yj.auto.slave.controller;

import com.yj.auto.common.Result;
import com.yj.auto.slave.dto.AddSlaveRequest;
import com.yj.auto.slave.dto.GetAllSlaveRequest;
import com.yj.auto.slave.service.SlaveService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("slave")
public class SlaveController {
    @Resource
    private SlaveService slaveService;

    @RequestMapping("add")
    public Result addSlave(@RequestBody AddSlaveRequest addSlaveRequest){
        return slaveService.addSlave(addSlaveRequest);
    }

    @RequestMapping("getSalve")
    public Result getAllSlave(@RequestBody GetAllSlaveRequest getAllSlaveRequest){
        return slaveService.findSlave(getAllSlaveRequest);
    }

}
