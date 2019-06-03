package com.techlabs.circle;

public class Circle {
	private float radius;
	private final float pi = 3.14f;
	String color;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float r) {
		radius = r;
	}

	public float calculateArea() {
		float area = radius * radius * pi;
		return area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = checkColor(c);
	}
	public String checkColor(String c)
	{
		String color;
		if(c.equalsIgnoreCase("red") || c.equalsIgnoreCase("blue") || c.equalsIgnoreCase("green"))
		{
			return c;
		}
		else
		{
			color="red";
			return color;
			
		}
	}

}
