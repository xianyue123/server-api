package com.server.bean;

import java.util.Date;

public class Batch {
    private Integer batchId;

    private Date batchdate;

    private String imgpath;

    private String batchname;

    private String datatype;

    private Integer batchstate;

    private Double kilometer;

    private Integer picturecount;

    private Integer layerId;

    public Batch(Integer batchId, Date batchdate, String imgpath, String batchname, String datatype, Integer batchstate, Double kilometer, Integer picturecount, Integer layerId) {
        this.batchId = batchId;
        this.batchdate = batchdate;
        this.imgpath = imgpath;
        this.batchname = batchname;
        this.datatype = datatype;
        this.batchstate = batchstate;
        this.kilometer = kilometer;
        this.picturecount = picturecount;
        this.layerId = layerId;
    }

    public Batch() {
        super();
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Date getBatchdate() {
        return batchdate;
    }

    public void setBatchdate(Date batchdate) {
        this.batchdate = batchdate;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname == null ? null : batchname.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public Integer getBatchstate() {
        return batchstate;
    }

    public void setBatchstate(Integer batchstate) {
        this.batchstate = batchstate;
    }

    public Double getKilometer() {
        return kilometer;
    }

    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    public Integer getPicturecount() {
        return picturecount;
    }

    public void setPicturecount(Integer picturecount) {
        this.picturecount = picturecount;
    }

    public Integer getLayerId() {
        return layerId;
    }

    public void setLayerId(Integer layerId) {
        this.layerId = layerId;
    }
}