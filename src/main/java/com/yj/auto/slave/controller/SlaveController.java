package com.yj.auto.slave.controller;

import com.yj.auto.common.Result;
import com.yj.auto.slave.dto.AddSlaveRequest;
import com.yj.auto.slave.dto.DeleteSlave;
import com.yj.auto.slave.dto.GetAllSlaveRequest;
import com.yj.auto.slave.dto.UpdateSlave;
import com.yj.auto.slave.service.SlaveService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("slave")
public class SlaveController {
    @Resource
    private SlaveService slaveService;

    @RequestMapping("add")
    public Result addSlave(@RequestBody @Valid AddSlaveRequest addSlaveRequest){
        return slaveService.addSlave(addSlaveRequest);
    }

    @RequestMapping("getSalve")
    public Result getAllSlave(@RequestBody GetAllSlaveRequest getAllSlaveRequest){
        return slaveService.findSlave(getAllSlaveRequest);
    }

    @RequestMapping("update")
    public Result updateSlave(@RequestBody @Valid UpdateSlave updateSlave){
        return slaveService.updateSlave(updateSlave);

    }

    @RequestMapping("delete")
    public Result deleteSlave(@RequestBody @Valid DeleteSlave deleteSlave){
        return slaveService.deleteSlave(deleteSlave);
    }

}
