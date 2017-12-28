package com.ztp.test;

import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import org.junit.Before;
import org.junit.Test;

import com.ztp.pojo.Course;
import com.ztp.pojo.Student;

public class ManyToMany {
	private Session session;
	private Transaction trs;
	@Before
	public void before(){
		//step1:读取主配置文件
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		

	
		
		
		//step2:创建session工厂
		SessionFactory factory = conf.buildSessionFactory();
		//step3:创建session
		session = factory.openSession();
		//step4:获取事务管理
		trs = session.beginTransaction();
}
	
		
	@Test
	public void manyToMany(){
		//查询
//		Student stu =  (Student) session.get(Student.class, 1);
//		Set<Course> courses = stu.getCourses();
//		for (Course co : courses) {
//			System.out.println(co);
//		}
		

		Student stu1 =  (Student) session.load(Student.class, 1);
		Set<Course> course = stu1.getCourses();
		for (Course cou : course) {
			System.out.println(cou);
		}
		
	}
	
	
}
