package com.hackerrank.StringsJava;

import java.util.Scanner;

//Complexity = O(n/2)
public class StringReversePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		
		//Convert string to a char array
		char[] arr = A.toCharArray();
		
		for (int i = 0; i <= ((A.length() / 2)); i++) {
			System.out.println(i + " " + (A.length() - i - 1));
			if (i == (A.length() / 2)) {
				System.out.println("Yes");
			}
			if (arr[i] == arr[A.length() - 1 - i]) {
				continue;
			} else {
				System.out.println("No");
				break;
			}
		}

	}
}