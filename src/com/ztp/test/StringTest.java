package com.ztp.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String��final�� �����ɱ� ���ַ���һ������ʼ�����Ͳ����Ա��ı䣬����ڷ������еĳ������С�
 * @author Administrator
 *
 */
public class StringTest {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "hello";
		method_1(s1,s2);
		System.out.println(s1+"...."+s2); //java....hello
		
		StringBuilder s11 = new StringBuilder("java");
		StringBuilder s22 = new StringBuilder("hello");
		method_2(s11,s22);
		System.out.println(s11+"-----"+s22); //javahello-----hello
		
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String str_time = df.format(d);
		System.out.println(str_time);

	}
	public static void method_1(String s1,String s2){
		s1.replace('a','k');
		s1 = s2;
	}
	public static void method_2(StringBuilder s1,StringBuilder s2){
		s1.append(s2);
		s1 = s2;
	}
}


