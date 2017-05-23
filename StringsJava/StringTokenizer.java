package com.hackerrank.StringsJava;

import java.util.Scanner;

//Complexity = O(1)
public class StringTokenizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

		String regex = "[ !,?._'@]+";
		String[] result = s.split(regex, 0);
		System.out.println("result[0]: " + result[0]);


		if (result[0].isEmpty()) {
			System.out.println(result.length - 1);
			for (int i = 1; i < result.length; i++) {
				System.out.println(result[i]);
			}
		} else {
			System.out.println(result.length);
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
}
