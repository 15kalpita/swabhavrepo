package com.techlabs.humantest;

import com.techlabs.human.Human;

public class HumanTestAge {

	public static void main(String[] args) {
		Human h1=new Human(5, 44, "ABC");
		printInfo(h1);
		System.out.println(h1.hashCode());
		Human h2=new Human(10, 50, "PQR", 30);
		printInfo(h2);
		System.out.println(h2.hashCode());
		Human elder=h1;
	    elder=h1.whoIsElder(h2);
		System.out.println("Elder is:"+elder.getName());
		System.out.println(elder.hashCode());
	}

	private static void printInfo(Human h1) {
		System.out.println("Name:"+h1.getName()+" Height:"+h1.getHeight()+" Weight:"+h1.getWeight()+" Age:"+h1.getAge());

	}

}
