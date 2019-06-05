package cn.kgc.tangcco.zhangqing.service.impl;

import cn.kgc.tangcco.zhangqing.dao.PersonDao;
import cn.kgc.tangcco.zhangqing.dao.impl.PersonDaoImpl;
import cn.kgc.tangcco.zhangqing.service.PersonService;

public class PersonServiceImpl implements PersonService {
	PersonDao pDao = new PersonDaoImpl();

	@Override
	public void heihei() {
		pDao.heihei();

	}

	@Override
	public void haha() {
		pDao.haha();
		
	}


}
