package com.babydays.model;

import java.io.Serializable;
import java.util.Date;

public class BValidate implements Serializable {

    private static final long serialVersionUID = 4799420350276439048L;

    private Integer id;

    private String token;

    private Integer userid;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}