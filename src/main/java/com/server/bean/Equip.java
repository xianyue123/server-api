package com.server.bean;

public class Equip {
    private Integer equipId;

    private String equipname;

    private String equiptype;

    private Integer equipno;

    public Equip(Integer equipId, String equipname, String equiptype, Integer equipno) {
        this.equipId = equipId;
        this.equipname = equipname;
        this.equiptype = equiptype;
        this.equipno = equipno;
    }

    public Equip() {
        super();
    }

    public Integer getEquipId() {
        return equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname == null ? null : equipname.trim();
    }

    public String getEquiptype() {
        return equiptype;
    }

    public void setEquiptype(String equiptype) {
        this.equiptype = equiptype == null ? null : equiptype.trim();
    }

    public Integer getEquipno() {
        return equipno;
    }

    public void setEquipno(Integer equipno) {
        this.equipno = equipno;
    }
}