package com.server.bean;

import java.util.Date;

public class UserProject {
    private Integer upId;

    private Integer userId;

    private Integer projId;

    private Date operatedate;

    private String operatelog;

    public UserProject(Integer upId, Integer userId, Integer projId, Date operatedate, String operatelog) {
        this.upId = upId;
        this.userId = userId;
        this.projId = projId;
        this.operatedate = operatedate;
        this.operatelog = operatelog;
    }

    public UserProject() {
        super();
    }

    public Integer getUpId() {
        return upId;
    }

    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public Date getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(Date operatedate) {
        this.operatedate = operatedate;
    }

    public String getOperatelog() {
        return operatelog;
    }

    public void setOperatelog(String operatelog) {
        this.operatelog = operatelog == null ? null : operatelog.trim();
    }
}