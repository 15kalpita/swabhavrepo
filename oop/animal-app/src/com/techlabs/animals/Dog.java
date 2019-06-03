package com.techlabs.animals;

import com.techlabs.pet.Pet;

public class Dog extends Canine implements Pet{

	@Override
	public void makeNoise() {
		System.out.println("barks");
	}

	@Override
	public void beFriendly() {
		System.out.println("Hello I'm Dog!");
	}

	@Override
	public void play() {
		System.out.println("playing with dog");
	}

}
