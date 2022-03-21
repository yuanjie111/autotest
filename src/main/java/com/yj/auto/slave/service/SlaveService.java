package com.yj.auto.slave.service;

import com.yj.auto.common.Result;
import com.yj.auto.entity.SlaveInfo;
import com.yj.auto.mapper.SlaveInfoMapper;
import com.yj.auto.slave.dto.AddSlaveRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class SlaveService {
    @Resource
    private SlaveInfoMapper slaveInfoMapper;

    public Result addSlave(AddSlaveRequest addSlaveRequest){
        SlaveInfo slaveInfo = new SlaveInfo();
        BeanUtils.copyProperties(addSlaveRequest,slaveInfo);
        int insert = slaveInfoMapper.insert(slaveInfo);
        Assert.isTrue(insert > 0, "添加失败");
        return Result.success("添加成功");
    }
}
