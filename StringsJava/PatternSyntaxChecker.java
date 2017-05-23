package com.hackerrank.StringsJava;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//Complexity O(n) n=testCases
public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		in.nextLine();
		while (testCases > 0) {
			testCases--;
			String pattern = in.nextLine();
			try {
				// Checks the validity of the regex pattern, else throws exception
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException ex) {
				System.out.println(ex.getDescription());
				System.out.println("Invalid");
			}
		}
		in.close();
	}
}
