package com.practice;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private double marks;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public double getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setMarks(double d) {
		this.marks = d;
	}
	@Override
	public String toString() {
		return "Student: [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks
				+ "]";
	}
	
	
	

}
