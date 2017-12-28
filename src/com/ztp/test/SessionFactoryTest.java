package com.ztp.test;

import org.hibernate.Session;
import org.junit.Test;

import com.ztp.pojo.User;
import com.ztp.util.SessionUtil;

/**
 * 测试二级缓存
 * @author Administrator
 *
 */
public class SessionFactoryTest {
	@Test
	public void testCache(){
		Session session	= SessionUtil.getsession();
		session.beginTransaction();
		User user = (User) session.get(User.class, 1);
		System.out.println(user.getUserName());
		session.getTransaction().commit();
		session.close(); //关闭一级缓存
		
		
		Session session2	= SessionUtil.getsession();
		session2.beginTransaction();
		User user2 = (User) session2.get(User.class, 1);
		System.out.println(user2.getUserName());
		
		User user3 = (User) session2.get(User.class, 1);
		System.out.println(user3.getUserName());
		
		session2.getTransaction().commit();
		session2.close();
		
	}
}
