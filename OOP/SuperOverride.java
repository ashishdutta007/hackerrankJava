package com.hackerrank.OOP;

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {

	@Override
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		// Using the super keyword to call the method from the superclass
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}

public class SuperOverride {
	public static void main(String[] args) {
		MotorCycle mocycle = new MotorCycle();
		System.out.println(mocycle.toString());
	}
}
