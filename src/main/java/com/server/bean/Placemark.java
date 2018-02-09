package com.server.bean;

import java.util.Date;

public class Placemark {
    private Integer pmId;

    private Integer batchId;

    private Date importtime;

    private Double longitude;

    private Double latitude;

    private Double altitude;

    private String frameindex;

    private String pictureurl;

    private Double gradient;

    private Double speed;

    private String type;

    private Double roll;

    private Double pitch;

    private Double yaw;

    private Object point;

    public Placemark(Integer pmId, Integer batchId, Date importtime, Double longitude, Double latitude, Double altitude, String frameindex, String pictureurl, Double gradient, Double speed, String type, Double roll, Double pitch, Double yaw, Object point) {
        this.pmId = pmId;
        this.batchId = batchId;
        this.importtime = importtime;
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.frameindex = frameindex;
        this.pictureurl = pictureurl;
        this.gradient = gradient;
        this.speed = speed;
        this.type = type;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.point = point;
    }

    public Placemark() {
        super();
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
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

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getFrameindex() {
        return frameindex;
    }

    public void setFrameindex(String frameindex) {
        this.frameindex = frameindex == null ? null : frameindex.trim();
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public Double getGradient() {
        return gradient;
    }

    public void setGradient(Double gradient) {
        this.gradient = gradient;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public Double getYaw() {
        return yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

    public Object getPoint() {
        return point;
    }

    public void setPoint(Object point) {
        this.point = point;
    }
}