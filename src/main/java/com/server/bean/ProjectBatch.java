package com.server.bean;

import java.util.Date;

public class ProjectBatch {
    private Integer id;

    private Integer projId;

    private Integer batchId;

    private Date reldate;

    public ProjectBatch(Integer id, Integer projId, Integer batchId, Date reldate) {
        this.id = id;
        this.projId = projId;
        this.batchId = batchId;
        this.reldate = reldate;
    }

    public ProjectBatch() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Date getReldate() {
        return reldate;
    }

    public void setReldate(Date reldate) {
        this.reldate = reldate;
    }
}