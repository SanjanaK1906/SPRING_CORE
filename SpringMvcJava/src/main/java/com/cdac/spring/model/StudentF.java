package com.cdac.spring.model;

public class StudentF {
	int sid;
	String name;
	int age;
	int std_class;
	public StudentF(int sid, String name, int age, int std_class) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.std_class = std_class;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStd_class() {
		return std_class;
	}
	public void setStd_class(int std_class) {
		this.std_class = std_class;
	}
	
	@Override
	public String toString() {
		return "StudentF [sid=" + sid + ", name=" + name + ", age=" + age + ", std_class=" + std_class + "]";
	}
}
