package com.hackerrank.StringsJava;

import java.util.Scanner;

//Complexity = O(n)
public class StringCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int k = scan.nextInt();
		scan.close();
		
		//Find biggest substring and smallest substring of length k?
		
		// Any substring is lexicographically bigger than ""
		String strBig = "";
		// Any substring is smaller than or equal to the parent String
		String strSmall = S;

		for (int i = 0; i <= S.length() - k; i++) {
			String str = S.substring(i, i + k);
			if (str.compareTo(strBig) > 0) {
				strBig = str;
			}
			if (str.compareTo(strSmall) < 0) {
				strSmall = str;
			}
			System.out.println(i + " " + k + " " + strSmall + " " + strBig);
		}
	}
}
