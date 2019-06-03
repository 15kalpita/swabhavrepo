package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestEquality {
	public static void main(String[] args) {
		Account acc1=new Account(201, "kalpita");
		Account acc2=new Account(201, "kalpita");
		System.out.println(acc1==acc1);
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
	}
}
