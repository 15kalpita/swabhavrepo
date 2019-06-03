package com.techlabs.account;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private static int count;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		// System.out.println("object created");
		count = count + 1;
	}

	public Account(int accno, String name) {
		this(accno, name, 500);

	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getCount() {
		return count;
	}

	public static int headCount() {
		return count;
	}

	public void deposite(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		if (balance - amt > 500) {
			balance = balance - amt;
		} else {
			System.out.println("balance will be less than 500");
		}

	}

	public String toString() {
		return ("acc no:" + accno + "name:" + name + "balance:" + balance);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		Account sameAcc = (Account) o;
		if (this.accno != sameAcc.accno)
			return false;
		if (!this.name.equals(sameAcc.name))
			return false;
		return true;

	}

}
