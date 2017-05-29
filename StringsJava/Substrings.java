package com.hackerrank.StringsJava;

import java.util.Scanner;

//Complexity = O(1)
public class Substrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int start = in.nextInt();
		int end = in.nextInt();

		in.close();
		System.out.println(S.substring(start, end));
	}
}
