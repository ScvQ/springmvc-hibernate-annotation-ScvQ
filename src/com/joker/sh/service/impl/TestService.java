package com.joker.sh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.joker.sh.dao.TestDao;
import com.joker.sh.model.entity.User;
import com.joker.sh.service.ITestService;

@Service("testService")
public class TestService implements ITestService {

	@Resource
	private TestDao testDao;

	@Override
	public void test() {

		List<User> list = this.testDao.queryUserListBySex(1);

		System.out.println(list.size());

		// User u = this.testDao.findById("0a8d327f44e1c82bd76baca33f553");

		// User u = this.testDao.findByHql("0a84f44e1c82bd76baca33f553");

		// System.out.println(u.getName());

		// this.testDao.updateByHql("0a8481d327f44e1c82bd76baca33f553",
		// "ABCXDEFLSDJFLDS");

		/*
		 * User u = new User();
		 * 
		 * u.setId("1234"); u.setName("小芳12345678"); u.setAge(380); u.setSex(2);
		 * 
		 * this.testDao.saveOrUpdate(u);
		 */

		// this.testDao.delete("9ea62c9bce284bd586a240a49c4e5bf0");

		// this.testDao.deleteByHql("073adc990abf43dea7145bc291cbf1e6");

		/*
		 * User u = new User();
		 * 
		 * u.setId(UUID.randomUUID().toString().replace("-", ""));
		 * u.setName("张正"); u.setAge(38); u.setSex(1);
		 * 
		 * this.testDao.add(u);
		 */

	}

}
