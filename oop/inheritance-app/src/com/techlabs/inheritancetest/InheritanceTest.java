package com.techlabs.inheritancetest;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Infant;
import com.techlabs.inheritance.Man;
import com.techlabs.inheritance.Kid;

public class InheritanceTest {

	public static void main(String[] args) {
		caseStudy1();
		caseStudy2();
		caseStudy3();
		caseStudy4();
	}

	public static void caseStudy1() {
		Man x = new Man();
		x.play();
		x.walk();
	}

	public static void caseStudy2() {
		Boy y = new Boy();
		y.play();
		y.eat();
		y.talk();
		y.walk();
	}

	public static void caseStudy3() {
		Man x = new Boy();
		x.walk();
		x.play();
	}

	public static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
//polymorphism via inheritance
	public static void atThePark(Man x) {
		System.out.println("at the park");
		x.play();
	}

}
