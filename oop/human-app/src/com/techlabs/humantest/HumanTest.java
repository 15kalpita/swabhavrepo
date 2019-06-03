package com.techlabs.humantest;

import com.techlabs.human.Human;

public class HumanTest {

	public static void main(String[] args) {
		 printInfo(new Human(100, 50, "kalpita"));
		 Human h1=new Human(100, 100, "kalpita");
		 printInfo(h1);
		 h1.workout();
		 System.out.println(h1.getWeight());
		 h1.eat();
		 System.out.println(h1.getHeight());
		 printInfo(h1);
	}
	public static void printInfo(Human h)
	{
		System.out.println("Name:"+h.getName()+" Height:"+h.getHeight()+" Weight"+h.getWeight());
	}

}
