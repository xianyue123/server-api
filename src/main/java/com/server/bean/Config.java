package com.server.bean;

public class Config {
    private Integer cfgId;

    private String cfgKey;

    private String cfgValue;

    private String remark;

    public Config(Integer cfgId, String cfgKey, String cfgValue, String remark) {
        this.cfgId = cfgId;
        this.cfgKey = cfgKey;
        this.cfgValue = cfgValue;
        this.remark = remark;
    }

    public Config() {
        super();
    }

    public Integer getCfgId() {
        return cfgId;
    }

    public void setCfgId(Integer cfgId) {
        this.cfgId = cfgId;
    }

    public String getCfgKey() {
        return cfgKey;
    }

    public void setCfgKey(String cfgKey) {
        this.cfgKey = cfgKey == null ? null : cfgKey.trim();
    }

    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue == null ? null : cfgValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}