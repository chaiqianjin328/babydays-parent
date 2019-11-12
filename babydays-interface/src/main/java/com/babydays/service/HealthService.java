package com.babydays.service;

import com.babydays.model.BHealth;
import com.babydays.model.ListResult;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;

public interface HealthService {

	void addHealth(BHealth health) throws Exception;

	ListResult healthList(HashMap<String, Object> valMap);

	void deleteHealthById(Integer id) throws Exception;

	PageInfo<BHealth> getHealths(String query, Integer pageNum, Integer pageSize, Integer stuId) throws Exception;

}
