package com.techlabs.rectangle;

public class Rectangle {
  public int width;
  public int height;
  public int calculateArea()
  {
	  int area=width*height;
	  System.out.println("width:"+width+" heigt:"+height);
	  return area;
  }
}
