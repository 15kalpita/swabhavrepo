package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1=new Account(1, "kalpita", 10000);
		Account a2=new Account(2, "abc");
		printInfo(a1);
		printInfo(a2);
		a1.deposite(500);
		printInfo(a1);
		a2.withdraw(500);
		printInfo(a2);
		a1.withdraw(10000);
		printInfo(a1);
	}
	static void printInfo(Account a)
	{
		System.out.println("Acc No:"+a.getAccno()+" Name:"+a.getName()+" Balance:"+a.getBalance());
	}

}
