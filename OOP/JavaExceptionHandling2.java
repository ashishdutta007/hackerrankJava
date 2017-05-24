package com.hackerrank.OOP;

import java.util.Scanner;

class MyCalculator1 {
	int power(int x, int y) {
		int result = (int) Math.pow(x, y);
		return result;
	}
}

public class JavaExceptionHandling2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyCalculator1 calc = new MyCalculator1();

		try {
			while (scan.hasNextInt()) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				System.out.println(calc.power(x, y));
			}
			scan.close();

		} catch (Exception e) {
		}

	}

}
