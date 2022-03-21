package com.yj.auto.entity;

import java.util.Date;

public class ProjectInfo {
    private Integer id;

    private String name;

    private String gitAddress;

    private String describe;

    private Integer status;

    private String operator;

    private String iosDeveloper;

    private String androidDeveloper;

    private Date lastPullTime;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGitAddress() {
        return gitAddress;
    }

    public void setGitAddress(String gitAddress) {
        this.gitAddress = gitAddress == null ? null : gitAddress.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getIosDeveloper() {
        return iosDeveloper;
    }

    public void setIosDeveloper(String iosDeveloper) {
        this.iosDeveloper = iosDeveloper == null ? null : iosDeveloper.trim();
    }

    public String getAndroidDeveloper() {
        return androidDeveloper;
    }

    public void setAndroidDeveloper(String androidDeveloper) {
        this.androidDeveloper = androidDeveloper == null ? null : androidDeveloper.trim();
    }

    public Date getLastPullTime() {
        return lastPullTime;
    }

    public void setLastPullTime(Date lastPullTime) {
        this.lastPullTime = lastPullTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}