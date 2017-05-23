package com.hackerrank.StringsJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Complexity = O(n) n=no. of  testCases
public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		scan.nextLine();
		String regex1 = "<([A-Za-z0-9\\s]+)>([A-Za-z0-9\\s]+)(?=<\\/\\1>)";
		while (testCases > 0) {
			testCases--;
			String input = scan.nextLine();
			// System.out.println(input);
			// Check validity of regex
			Pattern p = Pattern.compile(regex1);
			// Create matcher object
			Matcher m = p.matcher(input);
			// m.find() because substrings exist within the test input
			if (m.find()) {
				System.out.println(m.group(2));
			} else {
				System.out.println("None");
			}
			while (m.find()) {
				System.out.println(m.group(2));
			}
		}
		scan.close();
	}

}
