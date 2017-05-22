package com.hackerrank.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Complexity = O(n)
public class UsernameCheckerRegex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < testCases; i++) {
			String userName = scan.nextLine();
			/*
			 * The username can contain alphanumeric characters and/or
			 * underscores(_). The username must start with an alphabetic
			 * character. 8<= |Username|<= 30
			 */
			String usernameRegex = "^[A-Za-z][A-Z0-9a-z/_]{7,29}$";
			// Checking validity of regex and returning pattern instance
			Pattern p = Pattern.compile(usernameRegex);
			// Create matcher object to match pattern with input String
			Matcher m = p.matcher(userName);
			// System.out.println(userName);
			if (m.find()) {
				System.out.println("Valid");
			} else {
				System.out.println("InValid");
			}
		}
		scan.close();
	}
}
