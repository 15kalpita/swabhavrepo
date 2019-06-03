package com.techlabs.practice;

public class GetterSetter {
	private int size;
	public int getSize()
	{
		return size;
	}
	public void setSize(int size)
	{
		this.size=size;
	}
	public void size() {
		if(size<10)
		{
			System.out.println("small size");
		}
		else {
			System.out.println("big size");
		}
	}

}
