package com.techlabs.enusexampletest;

import com.techlabs.enumexample.EnumExample.season;

public class EnumExampleTest {

	public static void main(String[] args) {
		for(season s: season.values())
		{
			System.out.println(s);
		}

	}

}
