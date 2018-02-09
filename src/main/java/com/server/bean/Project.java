package com.server.bean;

import java.util.Date;

public class Project {
    private Integer projId;

    private String projname;

    private String people;

    private String remark;

    private Date editdate;

    private String timeversion;

    private String dataregion;

    private String gatherers;

    private String topology;

    private String datatype;

    private Integer userId;

    private Date createdate;

    private Integer projstate;

    private String projtype;

    public Project(Integer projId, String projname, String people, String remark, Date editdate, String timeversion, String dataregion, String gatherers, String topology, String datatype, Integer userId, Date createdate, Integer projstate, String projtype) {
        this.projId = projId;
        this.projname = projname;
        this.people = people;
        this.remark = remark;
        this.editdate = editdate;
        this.timeversion = timeversion;
        this.dataregion = dataregion;
        this.gatherers = gatherers;
        this.topology = topology;
        this.datatype = datatype;
        this.userId = userId;
        this.createdate = createdate;
        this.projstate = projstate;
        this.projtype = projtype;
    }

    public Project() {
        super();
    }

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname == null ? null : projname.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public String getTimeversion() {
        return timeversion;
    }

    public void setTimeversion(String timeversion) {
        this.timeversion = timeversion == null ? null : timeversion.trim();
    }

    public String getDataregion() {
        return dataregion;
    }

    public void setDataregion(String dataregion) {
        this.dataregion = dataregion == null ? null : dataregion.trim();
    }

    public String getGatherers() {
        return gatherers;
    }

    public void setGatherers(String gatherers) {
        this.gatherers = gatherers == null ? null : gatherers.trim();
    }

    public String getTopology() {
        return topology;
    }

    public void setTopology(String topology) {
        this.topology = topology == null ? null : topology.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getProjstate() {
        return projstate;
    }

    public void setProjstate(Integer projstate) {
        this.projstate = projstate;
    }

    public String getProjtype() {
        return projtype;
    }

    public void setProjtype(String projtype) {
        this.projtype = projtype == null ? null : projtype.trim();
    }
}