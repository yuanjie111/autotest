package com.yj.auto.slave.service;

import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.ProjectInfo;
import com.yj.auto.entity.SlaveInfo;
import com.yj.auto.mapper.SlaveInfoMapper;
import com.yj.auto.slave.dto.AddSlaveRequest;
import com.yj.auto.slave.dto.DeleteSlave;
import com.yj.auto.slave.dto.FindSlaveRequest;
import com.yj.auto.slave.dto.UpdateSlave;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SlaveService {
    @Resource
    private SlaveInfoMapper slaveInfoMapper;

//    添加slave
    public Result addSlave(AddSlaveRequest addSlaveRequest) {
        SlaveInfo slaveInfo = new SlaveInfo();
        BeanUtils.copyProperties(addSlaveRequest, slaveInfo);
        int insert = slaveInfoMapper.insertSelective(slaveInfo);
        Assert.isTrue(insert > 0, "添加失败");
        return Result.success("添加成功");
    }

//    查询salve
    public Result findSlave(FindSlaveRequest findSlaveRequest) {
        SlaveInfo slaveInfo = new SlaveInfo();
        BeanUtils.copyProperties(findSlaveRequest, slaveInfo);
        List<SlaveInfo> slaveInfos = slaveInfoMapper.selective(slaveInfo, findSlaveRequest.getPageSize(), (findSlaveRequest.getPageNum() - 1) * findSlaveRequest.getPageSize());
        Long total = slaveInfoMapper.getSalveCount(slaveInfo);
        PageResult<SlaveInfo> slaveResult = PageResult.buildResult(slaveInfos, total, findSlaveRequest.getPageNum(), findSlaveRequest.getPageSize());
        return Result.success(slaveResult);
    }

//    修改slave信息
    public Result updateSlave(UpdateSlave updateSlave) {
        SlaveInfo slaveInfo = new SlaveInfo();
        BeanUtils.copyProperties(updateSlave, slaveInfo);
        slaveInfo.setUpdateTime(new Date());
        int result = slaveInfoMapper.updateByPrimaryKeySelective(slaveInfo);
        Assert.isTrue(result > 0, "更新失败");
        return Result.success("更新成功");
    }

//    slave下线
    public Result deleteSlave(Long id) {
        SlaveInfo slaveInfo = slaveInfoMapper.selectByPrimaryKey(id);
        if(slaveInfo != null){
            slaveInfo.setStatus(0);
            int result = slaveInfoMapper.updateByPrimaryKeySelective(slaveInfo);
            Assert.isTrue(result > 0,"删除失败");
            return Result.success("删除失败");
        }
        return Result.error("300","不存在该记录");
    }
}
