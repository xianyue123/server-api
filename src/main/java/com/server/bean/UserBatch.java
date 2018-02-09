package com.server.bean;

public class UserBatch {
    private Integer tubId;

    private Integer userId;

    private Integer batchId;

    public UserBatch(Integer tubId, Integer userId, Integer batchId) {
        this.tubId = tubId;
        this.userId = userId;
        this.batchId = batchId;
    }

    public UserBatch() {
        super();
    }

    public Integer getTubId() {
        return tubId;
    }

    public void setTubId(Integer tubId) {
        this.tubId = tubId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }
}