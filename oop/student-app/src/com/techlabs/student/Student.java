package com.techlabs.student;

public class Student {
	private int rollno;
	private String name;
	GenderCategory gender;
	public void setRollno(int r)
	{
		rollno=r;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(GenderCategory g)
	{
		gender=g;
	}
	public GenderCategory getGender()
	{
		return gender;
		
	}
	

}
