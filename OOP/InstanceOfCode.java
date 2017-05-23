package com.hackerrank.OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceOfCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		ArrayList<Object> list = new ArrayList<Object>();
		for (int i = 0; i < t; i++) {
			String s = scan.nextLine();
			System.out.println(s);
			if (s.equals("Student")) {
				list.add(new Student());
				// System.out.println("Student");
			}
			if (s.equals("Rockstar")) {
				list.add(new Rockstar());
				// System.out.println("Rockstar");
			}
			if (s.equals("Hacker")) {
				list.add(new Hacker());
				// System.out.println("Hacker");
			}
		}
		scan.close();
		count(list);
	}

	static void count(ArrayList<Object> mylist) {
		int s = 0, r = 0, h = 0;
		for (int i = 0; i < mylist.size(); i++) {
			if (mylist.get(i) instanceof Student) {
				s++;
			}
			if (mylist.get(i) instanceof Rockstar) {
				r++;
			}
			if (mylist.get(i) instanceof Hacker) {
				h++;
			}
		}
		System.out.println(s + " " + r + " " + h);
	}
}
