package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestToString {

	public static void main(String[] args) {
		Account acc1=new Account(101, "abc", 1000);
		System.out.println(acc1);
		System.out.println(acc1.toString());
		
	}

}
