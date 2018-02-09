package com.server.bean;

public class Ppvision {
    private Integer imgId;

    private String imgname;

    private String train;

    private Integer batchId;

    private Double lon;

    private Double lat;

    private Double alt;

    private Double yaw;

    private Double pitch;

    private Double roll;

    private Double heading;

    private Double ground;

    private Integer level;

    private Integer type;

    private Integer imgtype;

    private String imgurl;

    private Object point;

    private Double x;

    private Double y;

    private Double z;

    private Double depth;

    public Ppvision(Integer imgId, String imgname, String train, Integer batchId, Double lon, Double lat, Double alt, Double yaw, Double pitch, Double roll, Double heading, Double ground, Integer level, Integer type, Integer imgtype, String imgurl, Object point, Double x, Double y, Double z, Double depth) {
        this.imgId = imgId;
        this.imgname = imgname;
        this.train = train;
        this.batchId = batchId;
        this.lon = lon;
        this.lat = lat;
        this.alt = alt;
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
        this.heading = heading;
        this.ground = ground;
        this.level = level;
        this.type = type;
        this.imgtype = imgtype;
        this.imgurl = imgurl;
        this.point = point;
        this.x = x;
        this.y = y;
        this.z = z;
        this.depth = depth;
    }

    public Ppvision() {
        super();
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train == null ? null : train.trim();
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(Double alt) {
        this.alt = alt;
    }

    public Double getYaw() {
        return yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

    public Double getPitch() {
        return pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Double getRoll() {
        return roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public Double getGround() {
        return ground;
    }

    public void setGround(Double ground) {
        this.ground = ground;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getImgtype() {
        return imgtype;
    }

    public void setImgtype(Integer imgtype) {
        this.imgtype = imgtype;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Object getPoint() {
        return point;
    }

    public void setPoint(Object point) {
        this.point = point;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }
}