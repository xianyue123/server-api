package com.server.bean;

import java.util.Date;

public class User {
    private Integer userId;

    private String username;

    private String password;

    private String fullname;

    private Date createdate;

    private String department;

    private String role;

    private String userkey;

    public User(Integer userId, String username, String password, String fullname, Date createdate, String department, String role, String userkey) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.createdate = createdate;
        this.department = department;
        this.role = role;
        this.userkey = userkey;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey == null ? null : userkey.trim();
    }
}