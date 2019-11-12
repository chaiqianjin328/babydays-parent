package com.babydays.service;

import com.babydays.model.BClass;
import com.babydays.model.ListResult;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

public interface ClassService {

	void addClass(BClass bClass) throws Exception;

	void eidtClass(BClass bClass) throws Exception;

	PageInfo<BClass> getClasses(String query, Integer pageNum, Integer pageSize, Integer gardenId) throws Exception;

	ListResult classList(HashMap<String, Object> valMap);

	List<BClass> getClassesByGardenId(HashMap<String, Object> valMap) throws Exception;

	BClass teacherAppointIsOrNot(Integer classId);

	void deleteClass(Integer id) throws Exception;

	BClass getClassById(Integer classId);

}
