package com.techlabs.customertest;

import com.techlabs.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1=new Customer("abc", "def");
		System.out.println("Customer 1 Id:"+c1.getId());
		Customer c2=new Customer("pqr", "stu");
		System.out.println("Customer 2 Id:"+c2.getId());
		Customer c3=new Customer("uvw", "xyz");
		System.out.println("Customer 1 Id:"+c1.getId());
		System.out.println("Customer 2 Id:"+c2.getId());
		System.out.println("Customer 3 Id:"+c3.getId());
		System.out.println("Customer 1 Id:"+c1.getId());
	}

}
