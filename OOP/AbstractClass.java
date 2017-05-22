package com.hackerrank.OOP;

import java.util.Scanner;

public class AbstractClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		MyBook booka = new MyBook();
		booka.setTitle(str);
		System.out.println(booka.getTitle());
	}
}

// abstract class cannot be instantiated 7847852889
// abstract class can be inherited
abstract class Book {
	public String title;

	// abstract method
	abstract void setTitle(String s);

	public String getTitle() {
		return this.title;
	}

}

class MyBook extends Book {
	void setTitle(String s) {
		this.title = s;
	}
}