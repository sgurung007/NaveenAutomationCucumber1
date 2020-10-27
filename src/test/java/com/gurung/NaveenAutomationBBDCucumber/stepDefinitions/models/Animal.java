package com.gurung.NaveenAutomationBBDCucumber.stepDefinitions.models;

public class Animal {
	public String animal;
	public String age;
	
	public Animal() {
		super();
	}
	
	public Animal(String animal, String age) {
		super();
		this.animal = animal;
		this.age = age;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
