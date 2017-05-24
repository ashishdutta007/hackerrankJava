package com.hackerrank.OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			scan.close();
			result = x / y;
			System.out.println(result);
		} catch (InputMismatchException ime) {
			System.out.println(ime.getClass().getName());
			System.out.println(ime.fillInStackTrace());
		} catch (ArithmeticException ae) {
			System.out.println(ae.getClass().getName());
			System.out.println(ae.fillInStackTrace());

		} catch (Exception ex) {
			System.out.println(ex.getClass().getName());
			System.out.println(ex.fillInStackTrace());
		}
	}
}
