package com.practice;

import java.util.ArrayList;
import java.util.List;

public class StudentProblem {

	public static void main(String[] args) {


		System.out.println(getAllStudents());
		
		List<Student> res=getStudentById(2);
		System.out.println(res);

		List<Student> res1=getStudentByName("tina");
		System.out.println(res1);
		
		List<Student> res2=getStudentByAge(12);
		System.out.println(res2);
		
		List<Student> res3=getStudentByMarks(65.5);
		System.out.println(res3);


	}

	private static List<Student> getStudentByMarks(double marks) {
		
		List<Student> students= getAllStudents();
		
		List<Student> result= new ArrayList<>();
		
		for(Student student: students) {
			if(student.getMarks()==65.5) {
				result.add(student);
			}
		}
		return result;
	}

	private static List<Student> getStudentByAge(int age) {
		
		List<Student> students=getAllStudents();
		
		List<Student> result=new ArrayList<>();
		
		for(Student student:students) {
			if(student.getAge()==age) {
				result.add(student);
			}
		}
		
		return result;
	}

	private static List<Student> getStudentByName(String name) {
		
		List<Student> students=getAllStudents();
		
		List<Student> result= new ArrayList<>();
		
		for(Student student: students) {
			if(student.getName().equals(name)) {
				result.add(student);
			}
		}
		return result;
	}

	private static List<Student> getStudentById(int id) {
		
		List<Student> students= getAllStudents();
		
		List<Student> result= new ArrayList<>();
		
		for(Student student: students) {
			if(student.getId()==id) {
				
				result.add(student);
			}
		}
		return result;
		
		
	}

	private static List<Student> getAllStudents() {

		Student student1=new Student();

		student1.setId(1);
		student1.setName("tina");
		student1.setGender("male");
		student1.setAge(12);
		student1.setMarks(85.5);

		Student student2=new Student();

		student2.setId(2);
		student2.setName("john");
		student2.setGender("female");
		student2.setAge(13);
		student2.setMarks(65.5);
		
		Student student3=new Student();
		student3.setId(3);
		student3.setName("ram");
		student3.setGender("male");
		student3.setAge(12);
		student3.setMarks(75.8);

		List<Student> studentsList=new ArrayList<>();

		studentsList.add(student1);
		studentsList.add(student2);		


		return studentsList;
	}





}


