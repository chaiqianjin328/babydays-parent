package com.babydays.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.babydays.dao.BAbilitiesCataDao;
import com.babydays.model.BAbilitiesCata;
import com.babydays.model.BAbilitiesCataExample;
import com.babydays.model.BAbilitiesCataExample.Criteria;
import com.babydays.service.AbilitiesCataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class AbilitiesCataServiceImpl implements AbilitiesCataService {

	
	@Autowired
	private BAbilitiesCataDao abilitiesCataDao;

	@Override
	public List<BAbilitiesCata> getAbilitiesCata(Integer parentId) throws Exception {
		BAbilitiesCataExample abilitiesCataExample = new BAbilitiesCataExample();
		Criteria criteria = abilitiesCataExample.createCriteria();
		if (parentId>=0) {
			criteria.andParentIdEqualTo(parentId);
			List<BAbilitiesCata> list = abilitiesCataDao.selectByExample(abilitiesCataExample);
			return list;
		}
		return null;
	}
	
	
	
}
