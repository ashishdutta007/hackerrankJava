package com.hackerrank.OOP;

import java.util.Scanner;

class MyCalculator1 {
	// if the method signature declares it throws some exception, the method can
	// then throw any subclass of that exception
	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		int result = (int) Math.pow(n, p);
		return result;
	}
}

public class JavaExceptionHandling2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyCalculator1 calc = new MyCalculator1();

		try {
			while (scan.hasNextInt()) {
				int n = scan.nextInt();
				int p = scan.nextInt();
				System.out.println(calc.power(n, p));
			}
			scan.close();

		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}

	}

}
