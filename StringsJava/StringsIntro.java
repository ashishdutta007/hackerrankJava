package com.hackerrank.StringsJava;

import java.util.Scanner;

//Complexity = O(1)
public class StringsIntro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		sc.close();
		System.out.println(A.length() + B.length());
		if (A.charAt(0) > B.charAt(0))
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.print(A.substring(0, 1).toUpperCase().concat(A.substring(1, A.length())) + " ");
		System.out.println(B.substring(0, 1).toUpperCase().concat(B.substring(1, B.length())) + " ");

	}
}
