package com.techlabs.animalstest;

import com.techlabs.animals.Animals;
import com.techlabs.animals.Canine;
import com.techlabs.animals.Cat;
import com.techlabs.animals.Dog;
import com.techlabs.animals.Hippo;
import com.techlabs.animals.Wolf;

public class AnimalsTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.roam();
		dog.makeNoise();
		Hippo hippo = new Hippo();
		hippo.makeNoise();
		Animals a = new Cat();
		a.sleep();
		Canine canin = new Wolf();
		canin.roam();
	}

}
