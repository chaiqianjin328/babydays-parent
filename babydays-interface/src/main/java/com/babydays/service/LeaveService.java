package com.babydays.service;

import com.babydays.model.BLeave;
import com.babydays.model.ListResult;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.HashMap;

public interface LeaveService {

	void addLeave(BLeave leave) throws Exception;

	ListResult leaveList(HashMap<String, Object> valMap);

	void deleteLeaveById(Integer id) throws Exception;

	PageInfo<BLeave> getLeaves(String query, Integer pageNum, Integer pageSize, Date start, Date end, Integer stuId,
                               Integer leaveday) throws Exception;

}
