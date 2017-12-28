package com.ztp.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import org.junit.Before;
import org.junit.Test;

import com.ztp.pojo.Dept;
import com.ztp.pojo.Emp;

public class OneToMany {
	private Session session;
	private Transaction trs;
	@Before
	public void before(){
		//step1:��ȡ�������ļ�
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		

	
		
		
		//step2:����session����
		SessionFactory factory = conf.buildSessionFactory();
		//step3:����session
		session = factory.openSession();
		//step4:��ȡ�������
		trs = session.beginTransaction();
}
	
		
	@Test
	public void oneMany(){
		//��ѯ
		Dept dept = (Dept) session.get(Dept.class, 10);
		Set<Emp> emps = dept.getEmps();
		System.out.println(emps.size());
		for (Emp e : emps) {
			System.out.println(e.getEname());
		}
		
		
//		//����
//		Dept d = new Dept();
//		d.setDeptno(50);
//		d.setDname("uc");
//		d.setLoc("cd");
//		
//		Emp e = new Emp();
//		e.setEname("wm");
//		e.setJob("java");
//		e.setSal(6500.0);
//		e.setEmpno(2345);
//		e.setDept(d);
//		
//		Emp e1 = new Emp();
//		e1.setEname("zz");
//		e1.setJob("java");
//		e1.setSal(9500.0);
//		e1.setEmpno(1234);
//		e1.setDept(d);
//		
//		Set<Emp> se = new HashSet<>();
//		se.add(e);
//		se.add(e1);
//		
//		d.setEmps(se);
//		
//		session.save(d);
//		trs.commit();
		
		
		
		
	}
	
	
}
