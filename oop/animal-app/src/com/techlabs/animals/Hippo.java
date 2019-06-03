package com.techlabs.animals;

public class Hippo extends Animals {

	@Override
	public void makeNoise() {
		System.out.println("hippo roar");
	}

	@Override
	public void roam() {
		System.out.println("roam alone");
	}

}
