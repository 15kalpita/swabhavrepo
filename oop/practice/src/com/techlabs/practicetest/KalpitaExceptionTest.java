package com.techlabs.practicetest;

import com.techlabs.practice.KalpitaException;

public class KalpitaExceptionTest {

	public static void main(String[] args) {
		try {
			validate("abc");
		} catch (Exception e) {
			System.out.println("exception "+e);
		}
		
		System.out.println("Thank You");
	}
	public static void validate(String name) throws KalpitaException
	{
		if(name=="kalpita")
		{
			System.out.println("valid user");
		}
		else
			throw new KalpitaException(name+" is not a valid user");
	}

}
