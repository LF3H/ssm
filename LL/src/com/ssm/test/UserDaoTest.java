package com.ssm.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.dao.UserDao;
import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
public class UserDaoTest {
	@Test
	public void findUserByIdDaotest(){
		//1.初始化Spring容器，加载配置文件
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过容器获取userDao实例
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		//UserDao userDao=applicationContext.getBean(UserDao.class);
		User user=userDao.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void findUserByldMapperTest(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper=(UserMapper)applicationContext.getBean("userMapper");
		User user=userMapper.findUserById(1);
		System.out.println(user);
	}
}