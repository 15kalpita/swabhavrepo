package com.techlabs;

public class TestPassByValue {

	public static void main(String[] args) {
		int mark = 100;
		changeMarkToZero(mark);
		System.out.println(mark);
		int[] marks = { 10, 20, 30 };
		changeMarkToZero(marks);
		for(int i:marks)
		{
			System.out.println(i);
		}
	}

	private static void changeMarkToZero(int mark) {
		mark = 0;

	}

	static void changeMarkToZero(int[] newMark) {
       int i;
       for(i=0;i<newMark.length;i++)
       {
    	   newMark[i]=0;
       }
	}
}
