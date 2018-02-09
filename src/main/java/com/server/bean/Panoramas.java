package com.server.bean;

import java.util.Date;

public class Panoramas {
    private Integer id;

    private Integer batchId;

    private Date importtime;

    private String pictureurl;

    private String imgid;

    private String camsn;

    private Double longitude;

    private Double latitude;

    private Double height;

    private Double roll;

    private Double pitch;

    private Double heading;

    private Double speed;

    private Double speedN;

    private Double speedE;

    private Double speedD;

    private String datetime;

    private String unixTimeSec;

    private String unixTimeMicrosec;

    private String systemstatus;

    private String filterstatus;

    private String havefix;

    private String extvelocity;

    private String distancetoprevious;

    private String releasemode;

    private Object point;

    public Panoramas(Integer id, Integer batchId, Date importtime, String pictureurl, String imgid, String camsn, Double longitude, Double latitude, Double height, Double roll, Double pitch, Double heading, Double speed, Double speedN, Double speedE, Double speedD, String datetime, String unixTimeSec, String unixTimeMicrosec, String systemstatus, String filterstatus, String havefix, String extvelocity, String distancetoprevious, String releasemode, Object point) {
        this.id = id;
        this.batchId = batchId;
        this.importtime = importtime;
        this.pictureurl = pictureurl;
        this.imgid = imgid;
        this.camsn = camsn;
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
        this.roll = roll;
        this.pitch = pitch;
        this.heading = heading;
        this.speed = speed;
        this.speedN = speedN;
        this.speedE = speedE;
        this.speedD = speedD;
        this.datetime = datetime;
        this.unixTimeSec = unixTimeSec;
        this.unixTimeMicrosec = unixTimeMicrosec;
        this.systemstatus = systemstatus;
        this.filterstatus = filterstatus;
        this.havefix = havefix;
        this.extvelocity = extvelocity;
        this.distancetoprevious = distancetoprevious;
        this.releasemode = releasemode;
        this.point = point;
    }

    public Panoramas() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Date getImporttime() {
        return importtime;
    }

    public void setImporttime(Date importtime) {
        this.importtime = importtime;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid == null ? null : imgid.trim();
    }

    public String getCamsn() {
        return camsn;
    }

    public void setCamsn(String camsn) {
        this.camsn = camsn == null ? null : camsn.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getRoll() {
        return roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Double getPitch() {
        return pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getSpeedN() {
        return speedN;
    }

    public void setSpeedN(Double speedN) {
        this.speedN = speedN;
    }

    public Double getSpeedE() {
        return speedE;
    }

    public void setSpeedE(Double speedE) {
        this.speedE = speedE;
    }

    public Double getSpeedD() {
        return speedD;
    }

    public void setSpeedD(Double speedD) {
        this.speedD = speedD;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public String getUnixTimeSec() {
        return unixTimeSec;
    }

    public void setUnixTimeSec(String unixTimeSec) {
        this.unixTimeSec = unixTimeSec == null ? null : unixTimeSec.trim();
    }

    public String getUnixTimeMicrosec() {
        return unixTimeMicrosec;
    }

    public void setUnixTimeMicrosec(String unixTimeMicrosec) {
        this.unixTimeMicrosec = unixTimeMicrosec == null ? null : unixTimeMicrosec.trim();
    }

    public String getSystemstatus() {
        return systemstatus;
    }

    public void setSystemstatus(String systemstatus) {
        this.systemstatus = systemstatus == null ? null : systemstatus.trim();
    }

    public String getFilterstatus() {
        return filterstatus;
    }

    public void setFilterstatus(String filterstatus) {
        this.filterstatus = filterstatus == null ? null : filterstatus.trim();
    }

    public String getHavefix() {
        return havefix;
    }

    public void setHavefix(String havefix) {
        this.havefix = havefix == null ? null : havefix.trim();
    }

    public String getExtvelocity() {
        return extvelocity;
    }

    public void setExtvelocity(String extvelocity) {
        this.extvelocity = extvelocity == null ? null : extvelocity.trim();
    }

    public String getDistancetoprevious() {
        return distancetoprevious;
    }

    public void setDistancetoprevious(String distancetoprevious) {
        this.distancetoprevious = distancetoprevious == null ? null : distancetoprevious.trim();
    }

    public String getReleasemode() {
        return releasemode;
    }

    public void setReleasemode(String releasemode) {
        this.releasemode = releasemode == null ? null : releasemode.trim();
    }

    public Object getPoint() {
        return point;
    }

    public void setPoint(Object point) {
        this.point = point;
    }
}