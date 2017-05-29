package com.hackerrank.OOP;

//A (.java) file can have multiple classes but only one public class
public class Inheritance1 {

	public static void main(String[] args) {
		Bird birdee = new Bird();
		birdee.walk();
		birdee.fly();
		birdee.sing();
	}
}

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}