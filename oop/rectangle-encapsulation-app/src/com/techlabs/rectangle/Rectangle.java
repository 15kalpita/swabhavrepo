package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int w) 
	{
		width=check(w);
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int h) 
	{
		height=check(h);
	}
	public int check(int val)
	{
		if(val>100)
		{val=100;}
		if(val<1)
		{val=1;}
		return val;
	}
	
	 public int calculateArea()
	  {
		  int area=width*height;
		  return area;
	  }

}
