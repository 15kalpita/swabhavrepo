package com.techlabs.animals;

public abstract class Animals {
	abstract void makeNoise();

	abstract void roam();

	public void eat() {
		System.out.println("eating");
	}

	public void sleep() {
		System.out.println("sleeping");
	}

}
