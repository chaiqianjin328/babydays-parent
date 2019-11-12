package com.babydays.model;

import java.io.Serializable;

public class BPermission implements Serializable {

    private static final long serialVersionUID = -2727711686673574171L;

    private Integer id;

    private String role;

    private String permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}