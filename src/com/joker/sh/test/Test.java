package com.joker.sh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joker.sh.dao.TestDao;
import com.joker.sh.model.entity.User;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		 TestDao testDao = (TestDao) ac.getBean("testDao");
		 
		 User user = testDao.findById("1");
		 System.out.println(user.getName());
		 
		 
	}

}
