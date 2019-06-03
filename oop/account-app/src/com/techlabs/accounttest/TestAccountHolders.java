package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestAccountHolders {

	public static void main(String[] args) {
		Account a1=new Account(1, "kalpita", 10000);
		System.out.println(a1.getCount());
		Account a2=new Account(2, "abc");
		System.out.println(a2.getCount());
		Account a3=new Account(2, "pqr", 600);
		System.out.println(a3.getCount());
		System.out.println("total count:"+Account.headCount());
	}

}
