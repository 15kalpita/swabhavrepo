package com.techlabs;

import java.util.Scanner;

public class TestUrl {

	public static void main(String[] args) {

		String str = args[0];
		System.out.println(str);
		String[] companyName = str.split("\\.");
		//System.out.println(companyName.length);
		String company = companyName[1];
		System.out.println("Company:"+company);
		String[] devloperName = str.split("\\=");
//		System.out.println(devloperName.length);
		String devloper = devloperName[1];
//		if(devloper==null)
//		{System.out.println("");}
		System.out.println("programmer:"+ devloper);
	}

}
