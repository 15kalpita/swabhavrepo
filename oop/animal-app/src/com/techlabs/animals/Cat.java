package com.techlabs.animals;

import com.techlabs.pet.Pet;

public class Cat extends Feline implements Pet{

	@Override
	public void makeNoise() {
		System.out.println("meow");
	}

	@Override
	public void beFriendly() {
		System.out.println("Hello I'm cat!");
	}

	@Override
	public void play() {
		System.out.println("playing with cat");
	}

}
