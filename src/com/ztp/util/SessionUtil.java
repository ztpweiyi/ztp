package com.ztp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class SessionUtil {
	private static Session session;
	
	
	public static Session getsession(){
		//step1:读取主配置文件
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		

	
		
		
		//step2:创建session工厂
		SessionFactory factory = conf.buildSessionFactory();
		//step3:创建session
		session = factory.openSession();
		
		return session;
}
}
