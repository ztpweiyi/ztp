package com.ztp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class SessionUtil {
	private static Session session;
	
	
	public static Session getsession(){
		//step1:��ȡ�������ļ�
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		

	
		
		
		//step2:����session����
		SessionFactory factory = conf.buildSessionFactory();
		//step3:����session
		session = factory.openSession();
		
		return session;
}
}
