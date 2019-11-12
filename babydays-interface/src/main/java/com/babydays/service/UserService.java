package com.babydays.service;

import com.babydays.model.BUser;

import java.util.List;

public interface UserService {

	BUser selectUserByUandP(BUser user);

	List<BUser> selectAdminByUsername(String username);

	
	
	
	
}
