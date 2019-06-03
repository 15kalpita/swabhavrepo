package com.techlabs.human;

public class Human {
	private float height;
	private float weight;
	private String name;
	private int age;

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Human(float height, float weight, String name) {
		this(height, weight, name, 18);
	}

	public Human(float height, float weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}

	public void workout() {
		weight = weight - (weight * 0.02f);
	}

	public void eat() {
		weight = weight + (weight * 0.05f);
		height = height + (height * 0.01f);
	}

	public Human whoIsElder(Human h2) {
		if (h2.getHeight() > this.height) {
			return h2;
		}
		return this;
	}
}
