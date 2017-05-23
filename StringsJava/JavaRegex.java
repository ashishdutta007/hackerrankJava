package com.hackerrank.StringsJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Complexity = O(n) n=no. of input strings
public class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.nextLine();
			String regex = "(([0]{1,3}|[0]{0,2}[0-9]|[0]{0,1}[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0]{1,3}|[0]{0,2}[0-9]|[0]{0,1}[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
			// Checking syntax validity of regex pattern, returns a pattern instance
			Pattern p = Pattern.compile(regex);
			// Creates a matcher to match the pattern(p) to the input string
			Matcher m = p.matcher(IP);
			// Check if pattern matches using the matcher
			System.out.println(m.matches());
		}
		in.close();
	}
}

class MyRegex {

	public MyRegex() {
	}

	String pattern = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
}