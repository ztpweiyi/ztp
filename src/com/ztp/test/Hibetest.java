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
		//step1:��ȡ�������ļ�
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
//		//�Զ����ɱ�
//		SchemaExport se = new SchemaExport(conf);
//		se.create(true, true);
	
		
		
		//step2:����session����
		SessionFactory factory = conf.buildSessionFactory();
		//step3:����session
		session = factory.openSession();
		//step4:��ȡ�������
		trs = session.beginTransaction();
}
	@Test
	public void save(){
		/**
		 * ������hibernate��������״̬
		 * 1.��ʱ״̬
		 * 2.�־û�״̬
		 * 3.����״̬
		 */
		
//		System.out.println(session);
		//��ʱ״̬
//		User user = new User();
//		user.setUserName("����");
//		user.setPassWord("123456");
//		user.setRoleId(2);
//		//�־û�״̬
//		//����
//		Serializable id = session.save(user);
//		//�ύ����
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
//		//�˴���user1��������״̬ ����SESSION�Ļ�������
//		//session ��hibernate��һ������
//		//SessionFactory ��hibernate�Ķ�������
//		user1 = (User) session.load(User.class,id);
//		System.out.println(user1 == user);
//		
////		user.setId(5);
//		//�������������ʱ�����������������UPDATE��䣬��֮��INSERT���
////		session.saveOrUpdate(user);
//		
//		user.setId(6);
//		session.delete(user);
//		trs.commit();
	}
	
	@Test
	public void query(){
//		/**
//		 * load��������鲻������ ���׳�һ���쳣 ���ص���һ���������
//		 * get��������鲻������ ����һ����ֵ��null�����ص���һ��ʵ�����
//		 */
//		User u = (User) session.load(User.class,14);
//		System.out.println(u);
//		
//		User u1 = (User) session.get(User.class,14);
//		System.out.println(u1);
//		
//		//Query ��ѯ�ӿ� 	HQL  ����
//		String sql = "from User";
//		Query query = session.createQuery(sql);
//		//��ҳ���淨
//		query.setFirstResult(5);
//		query.setMaxResults(5);
//		List<User> us = query.list();
//		for (User user : us) {
//			System.out.println(user);
//			
//		}
		
//		//���ʹ�ô������Ĳ�ѯ  �ã�����վλ
//		String sql1 = "from User where id = ?";
//		Query query1 = session.createQuery(sql1);
//		query1.setInteger(0, 1);
//		User u = (User) query1.uniqueResult();
//		System.out.println(u);
		
//		//�ڶ��ִ������Ĳ�ѯ ʹ�� ������
//		String sql2 = "from User where id = :С��";
//		Query query2 = session.createQuery(sql2);
//		query2.setInteger("С��", 2);
//		User u = (User) query2.uniqueResult();
//		System.out.println(u);
		
//		//ʹ��SQL���в�ѯ
//		String sql2 = "select * from t_user";
//		SQLQuery query3 =  session.createSQLQuery(sql2);
//		query3.addEntity(User.class);
//		List<User> us1 = query3.list();
//		for (User user : us1) {
//			System.out.println(user);
//		}
		
		//�����ֲ�ѯ critreia
		
		Criteria  criteria  = session.createCriteria(User.class);
		List<User> us2 = criteria.list();
		for (User user : us2) {
			System.out.println(user);
		}
	}
	
	
}
