package com.babydays.service;

import com.babydays.model.BAbilitiesCata;

import java.util.List;

public interface AbilitiesCataService {

	List<BAbilitiesCata> getAbilitiesCata(Integer parentId) throws Exception;

}
