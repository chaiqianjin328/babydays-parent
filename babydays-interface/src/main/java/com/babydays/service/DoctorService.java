package com.babydays.service;

import com.babydays.model.BDoctor;
import com.babydays.model.BUser;
import com.babydays.model.ListResult;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;

public interface DoctorService {

	BDoctor selectDoctorById(Integer detailsId);

	void insertSelective(BDoctor doctor, BUser user) throws Exception;

	void resetStatusDoctor(Integer id) throws Exception;

	void updateDoctor(BDoctor doctor) throws Exception ;

	PageInfo<BDoctor> getDoctors(String query, Integer pageNum, Integer pageSize) throws Exception;

	ListResult doctorList(HashMap<String, Object> valMap);

}
