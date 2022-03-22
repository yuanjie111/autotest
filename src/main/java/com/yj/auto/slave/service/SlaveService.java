package com.yj.auto.slave.service;

import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.SlaveInfo;
import com.yj.auto.mapper.SlaveInfoMapper;
import com.yj.auto.slave.dto.AddSlaveRequest;
import com.yj.auto.slave.dto.GetAllSlaveRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SlaveService {
    @Resource
    private SlaveInfoMapper slaveInfoMapper;

    public Result addSlave(AddSlaveRequest addSlaveRequest){
        SlaveInfo slaveInfo = new SlaveInfo();
        BeanUtils.copyProperties(addSlaveRequest,slaveInfo);
        int insert = slaveInfoMapper.insertSelective(slaveInfo);
        Assert.isTrue(insert > 0, "添加失败");
        return Result.success("添加成功");
    }

    public Result findSlave(GetAllSlaveRequest getAllSlaveRequest) {
        List<SlaveInfo> slaveInfos;
        slaveInfos = slaveInfoMapper.selectAll(getAllSlaveRequest.getPageSize(), (getAllSlaveRequest.getPageNum()-1) * getAllSlaveRequest.getPageSize() );
        Long total = slaveInfoMapper.getAllSalveCount();
        PageResult<SlaveInfo> slaveResult = PageResult.buildResult(slaveInfos, total, getAllSlaveRequest.getPageNum(), getAllSlaveRequest.getPageSize());
        return Result.success(slaveResult);
    }
}
