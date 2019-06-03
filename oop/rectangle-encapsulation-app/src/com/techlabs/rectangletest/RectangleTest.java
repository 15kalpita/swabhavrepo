package com.techlabs.rectangletest;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setHeight(1000);
		r.setWidth(0);
		int area=r.calculateArea();
		System.out.println("width="+r.getWidth()+"height="+r.getHeight());
		System.out.println("area="+area);
	}

}
