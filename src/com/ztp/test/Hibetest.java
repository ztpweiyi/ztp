package com.ztp.test;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Before;
import org.junit.Test;

import com.ztp.pojo.User;

public class Hibetest {
	private Session session;
	private Transaction trs;
	@Before
	public void before(){
		//step1:读取主配置文件
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
//		//自动生成表
//		SchemaExport se = new SchemaExport(conf);
//		se.create(true, true);
	
		
		
		//step2:创建session工厂
		SessionFactory factory = conf.buildSessionFactory();
		//step3:创建session
		session = factory.openSession();
		//step4:获取事务管理
		trs = session.beginTransaction();
}
	@Test
	public void save(){
		/**
		 * 对象在hibernate里有三种状态
		 * 1.临时状态
		 * 2.持久化状态
		 * 3.游离状态
		 */
		
//		System.out.println(session);
		//临时状态
//		User user = new User();
//		user.setUserName("安妮");
//		user.setPassWord("123456");
//		user.setRoleId(2);
//		//持久化状态
//		//保存
//		Serializable id = session.save(user);
//		//提交事务
//		trs.commit();
//		System.out.println(id);
		
//		User user1 = (User) session.load(User.class,id);
//		System.out.println(user1 == user);
//		
//		trs.commit();
//		user1 = (User) session.load(User.class,id);
//		System.out.println(user1 == user);
//		session.close();
//		
//		//此处的user1处于游离状态 不在SESSION的缓存中了
//		//session 是hibernate的一级缓存
//		//SessionFactory 是hibernate的二级缓存
//		user1 = (User) session.load(User.class,id);
//		System.out.println(user1 == user);
//		
////		user.setId(5);
//		//调用这个方法的时候，如果设置了主键则发UPDATE语句，反之则发INSERT语句
////		session.saveOrUpdate(user);
//		
//		user.setId(6);
//		session.delete(user);
//		trs.commit();
	}
	
	@Test
	public void query(){
//		/**
//		 * load方法如果查不到数据 会抛出一个异常 返回的是一个代理对象
//		 * get方法如果查不到数据 返回一个空值（null）返回的是一个实体对象
//		 */
//		User u = (User) session.load(User.class,14);
//		System.out.println(u);
//		
//		User u1 = (User) session.get(User.class,14);
//		System.out.println(u1);
//		
//		//Query 查询接口 	HQL  常用
//		String sql = "from User";
//		Query query = session.createQuery(sql);
//		//分页的玩法
//		query.setFirstResult(5);
//		query.setMaxResults(5);
//		List<User> us = query.list();
//		for (User user : us) {
//			System.out.println(user);
//			
//		}
		
//		//如何使用带条件的查询  用？进行站位
//		String sql1 = "from User where id = ?";
//		Query query1 = session.createQuery(sql1);
//		query1.setInteger(0, 1);
//		User u = (User) query1.uniqueResult();
//		System.out.println(u);
		
//		//第二种带条件的查询 使用 ：？？
//		String sql2 = "from User where id = :小马";
//		Query query2 = session.createQuery(sql2);
//		query2.setInteger("小马", 2);
//		User u = (User) query2.uniqueResult();
//		System.out.println(u);
		
//		//使用SQL进行查询
//		String sql2 = "select * from t_user";
//		SQLQuery query3 =  session.createSQLQuery(sql2);
//		query3.addEntity(User.class);
//		List<User> us1 = query3.list();
//		for (User user : us1) {
//			System.out.println(user);
//		}
		
		//第三种查询 critreia
		
		Criteria  criteria  = session.createCriteria(User.class);
		List<User> us2 = criteria.list();
		for (User user : us2) {
			System.out.println(user);
		}
	}
	
	
}
