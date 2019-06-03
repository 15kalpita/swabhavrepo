package com.techlabs;

public class OverloadingTest {

	public static void main(String[] args) {
//		int i=10;
//		char ch='a';
//		double d=10.2;
//		char s[]= {'a','b','c','d'};
//		long l=1000;
//		String s1="hello";
//		boolean b= true;
//		
//		System.out.println(i);
//		System.out.println(ch);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(l);
//		System.out.println(s1);
//		System.out.println(b);
//		
	  int a[]= {10,20};
	  printThis(10);
	  printThis('a');
	  printThis(10.55f);
	  printThis("hello");
	  printThis(a);

	}
	
    private static void printThis(int x)
	{
		System.out.println(x);
	}
    private static void printThis(char x)
	{
		System.out.println(x);
	}
    private static void printThis(String s)
	{
		System.out.println(s);
	}
    private static void printThis(double x)
	{
		System.out.println(x);
	}
    private static void printThis(int a[])
    {
    	for(int i=0;i<2;i++)
    		System.out.print(a[i]);
    }

}
