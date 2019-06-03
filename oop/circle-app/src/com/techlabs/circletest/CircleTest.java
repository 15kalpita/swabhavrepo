package com.techlabs.circletest;

import com.techlabs.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(2.5f);
//		float area=c.calculateArea();
		c.setColor("Green");
//		System.out.println("radius:"+c.getRadius()+" area:"+area+" color:"+c.getColor());
//		Circle temp=c;
//		System.out.println(temp.getRadius());
//		System.out.println(c.getRadius());
//		temp.setRadius(1.5f);
//		System.out.println(temp.getRadius());
//		System.out.println(c.getRadius());
//		Circle c2=new Circle();
//		c2.setRadius(5);
//		c2.setColor("blue");
//		printInfo(c2);
//		System.out.println(new Circle().calculateArea());
//		printInfo(new Circle());
		Circle[] circle=new Circle[3];
		circle[0]=new Circle();
		circle[0].setRadius(10);
		circle[0].calculateArea();
		circle[0].setColor("pink");
		printInfo(circle[0]);
		circle[1]=new Circle();
		circle[1].setRadius(20);
		circle[1].calculateArea();
		circle[1].setColor("blue");
		printInfo(circle[1]);
		circle[2]=new Circle();
		circle[2].setRadius(30);
		circle[2].calculateArea();
		circle[2].setColor("Green");
		printInfo(circle[2]);
	}
	public static void printInfo(Circle c)
	{
		float area=c.calculateArea();
		System.out.println("radius:"+c.getRadius()+" area:"+area+" color:"+c.getColor());
	}

}
