package com.techlabs;

public class ArgumentTest {

	public static void main(String[] args) {

		System.out.println(args.length);
		if (args.length == 0) {
			System.out.println("no argument");
		}
		for (String name : args) {
			System.out.println("hello " + name);
		}
	}

}
