package com.techlabs.practicetest;

import com.techlabs.practice.GetterSetter;

public class GetterSetterTest {
	public static void main(String[] args) {
		GetterSetter a=new GetterSetter();
		a.setSize(10);
		System.out.println("size:"+a.getSize());
		a.size();
	}
}
