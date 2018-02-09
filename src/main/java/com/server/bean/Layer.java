package com.server.bean;

public class Layer {
    private Integer layerId;

    private String layernum;

    private Integer projId;

    private String remark;

    public Layer(Integer layerId, String layernum, Integer projId, String remark) {
        this.layerId = layerId;
        this.layernum = layernum;
        this.projId = projId;
        this.remark = remark;
    }

    public Layer() {
        super();
    }

    public Integer getLayerId() {
        return layerId;
    }

    public void setLayerId(Integer layerId) {
        this.layerId = layerId;
    }

    public String getLayernum() {
        return layernum;
    }

    public void setLayernum(String layernum) {
        this.layernum = layernum == null ? null : layernum.trim();
    }

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}