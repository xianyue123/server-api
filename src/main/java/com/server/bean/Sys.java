package com.server.bean;

public class Sys {
    private Integer csysId;

    private String csysName;

    private String csysType;

    private String csysContent;

    private String csysIwType;

    private String csysIwValue;

    private String csysFeature;

    public Sys(Integer csysId, String csysName, String csysType, String csysContent, String csysIwType, String csysIwValue, String csysFeature) {
        this.csysId = csysId;
        this.csysName = csysName;
        this.csysType = csysType;
        this.csysContent = csysContent;
        this.csysIwType = csysIwType;
        this.csysIwValue = csysIwValue;
        this.csysFeature = csysFeature;
    }

    public Sys() {
        super();
    }

    public Integer getCsysId() {
        return csysId;
    }

    public void setCsysId(Integer csysId) {
        this.csysId = csysId;
    }

    public String getCsysName() {
        return csysName;
    }

    public void setCsysName(String csysName) {
        this.csysName = csysName == null ? null : csysName.trim();
    }

    public String getCsysType() {
        return csysType;
    }

    public void setCsysType(String csysType) {
        this.csysType = csysType == null ? null : csysType.trim();
    }

    public String getCsysContent() {
        return csysContent;
    }

    public void setCsysContent(String csysContent) {
        this.csysContent = csysContent == null ? null : csysContent.trim();
    }

    public String getCsysIwType() {
        return csysIwType;
    }

    public void setCsysIwType(String csysIwType) {
        this.csysIwType = csysIwType == null ? null : csysIwType.trim();
    }

    public String getCsysIwValue() {
        return csysIwValue;
    }

    public void setCsysIwValue(String csysIwValue) {
        this.csysIwValue = csysIwValue == null ? null : csysIwValue.trim();
    }

    public String getCsysFeature() {
        return csysFeature;
    }

    public void setCsysFeature(String csysFeature) {
        this.csysFeature = csysFeature == null ? null : csysFeature.trim();
    }
}