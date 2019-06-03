package com.techlabs.rectangletest;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
      Rectangle small=new Rectangle();
      small.width=10;
      small.height=5;
      int smallArea=small.calculateArea();
      System.out.println("area of small reactangle:"+smallArea);
      Rectangle big=new Rectangle();
      big.width=30;
      big.height=15;
      int bigArea=big.calculateArea();
      System.out.println("area of big rectangle:"+bigArea);
	}

}
