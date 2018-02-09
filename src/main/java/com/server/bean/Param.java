package com.server.bean;

public class Param {
    private Integer paramId;

    private Double focalx;

    private Double focaly;

    private Double principalx;

    private Double principaly;

    private Double width;

    private Double height;

    private Double skew;

    private Double k1;

    private Double k2;

    private Double k3;

    private Double k4;

    private Double p1;

    private Double p2;

    private String equipId;

    private String ext;

    public Param(Integer paramId, Double focalx, Double focaly, Double principalx, Double principaly, Double width, Double height, Double skew, Double k1, Double k2, Double k3, Double k4, Double p1, Double p2, String equipId, String ext) {
        this.paramId = paramId;
        this.focalx = focalx;
        this.focaly = focaly;
        this.principalx = principalx;
        this.principaly = principaly;
        this.width = width;
        this.height = height;
        this.skew = skew;
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
        this.k4 = k4;
        this.p1 = p1;
        this.p2 = p2;
        this.equipId = equipId;
        this.ext = ext;
    }

    public Param() {
        super();
    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public Double getFocalx() {
        return focalx;
    }

    public void setFocalx(Double focalx) {
        this.focalx = focalx;
    }

    public Double getFocaly() {
        return focaly;
    }

    public void setFocaly(Double focaly) {
        this.focaly = focaly;
    }

    public Double getPrincipalx() {
        return principalx;
    }

    public void setPrincipalx(Double principalx) {
        this.principalx = principalx;
    }

    public Double getPrincipaly() {
        return principaly;
    }

    public void setPrincipaly(Double principaly) {
        this.principaly = principaly;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSkew() {
        return skew;
    }

    public void setSkew(Double skew) {
        this.skew = skew;
    }

    public Double getK1() {
        return k1;
    }

    public void setK1(Double k1) {
        this.k1 = k1;
    }

    public Double getK2() {
        return k2;
    }

    public void setK2(Double k2) {
        this.k2 = k2;
    }

    public Double getK3() {
        return k3;
    }

    public void setK3(Double k3) {
        this.k3 = k3;
    }

    public Double getK4() {
        return k4;
    }

    public void setK4(Double k4) {
        this.k4 = k4;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId == null ? null : equipId.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}