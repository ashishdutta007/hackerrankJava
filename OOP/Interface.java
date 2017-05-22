package com.hackerrank.OOP;

import java.util.Scanner;

class MyCalculator implements AdvancedArithmetic {

	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			} else {
				continue;
			}
		}
		return sum;
	}

}

public class Interface {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		ImplementedInterfaceNames(calc);
		System.out.println(calc.divisor_sum(num));
	}

	static void ImplementedInterfaceNames(Object obj) {
		Class[] interfaces = obj.getClass().getInterfaces();
		System.out.println("Implemented interfaces:" + interfaces[0].getName());
	}
}
