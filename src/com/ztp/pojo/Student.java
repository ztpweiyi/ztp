package com.ztp.pojo;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private int studentId;
	private int age;
	
	private Set<Course> courses = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentId=" + studentId + ", age=" + age + "]";
	}

	
	
	
}
