package com.techlabs.studenttest;

import com.techlabs.student.GenderCategory;
import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("kalpita");
		GenderCategory g1=GenderCategory.F;
		s1.setGender(g1);
		printInfo(s1);
	}
	public static void printInfo(Student s)
	{
		System.out.println("RollNo:"+s.getRollno()+" Name:"+s.getName()+" Gender:"+s.getGender());
	}

}
