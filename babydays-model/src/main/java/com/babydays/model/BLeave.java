package com.babydays.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BLeave implements Serializable {

    private static final long serialVersionUID = -1470236599034666149L;

    private Integer id;

    private Integer stuId;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endTime;

    private Integer leaveday;

    private String leaveContent;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLeaveday() {
        return leaveday;
    }

    public void setLeaveday(Integer leaveday) {
        this.leaveday = leaveday;
    }

    public String getLeaveContent() {
        return leaveContent;
    }

    public void setLeaveContent(String leaveContent) {
        this.leaveContent = leaveContent == null ? null : leaveContent.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}