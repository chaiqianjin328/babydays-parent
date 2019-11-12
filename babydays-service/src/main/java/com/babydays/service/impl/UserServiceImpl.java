package com.babydays.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.babydays.dao.BUserDao;
import com.babydays.model.BUser;
import com.babydays.model.BUserExample;
import com.babydays.model.BUserExample.Criteria;
import com.babydays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {

	@Autowired
	BUserDao userDao;
	
	
	
	@Override
	public BUser selectUserByUandP(BUser user) {
		BUserExample userExample = new BUserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		List<BUser> list = userDao.selectByExample(userExample);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}



	@Override
	public List<BUser> selectAdminByUsername(String username) {
		BUserExample bUserExample = new BUserExample();
		Criteria criteria = bUserExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		return userDao.selectByExample(bUserExample);
	}

	
	
	
}
