package com.ztp.pojo;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private int courseId;
	private String courseName;
	
	private Set<Student> students = new HashSet<>();
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName +"]";
	}
	
	
	
}
