package com.server.bean;

import java.util.Date;

public class Line {
    private Integer lineId;

    private Integer batchId;

    private Integer projId;

    private String datatype;

    private Date importdate;

    private Object gline;

    public Line(Integer lineId, Integer batchId, Integer projId, String datatype, Date importdate, Object gline) {
        this.lineId = lineId;
        this.batchId = batchId;
        this.projId = projId;
        this.datatype = datatype;
        this.importdate = importdate;
        this.gline = gline;
    }

    public Line() {
        super();
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public Date getImportdate() {
        return importdate;
    }

    public void setImportdate(Date importdate) {
        this.importdate = importdate;
    }

    public Object getGline() {
        return gline;
    }

    public void setGline(Object gline) {
        this.gline = gline;
    }
}