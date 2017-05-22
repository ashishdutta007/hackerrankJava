package com.hackerrank.Strings;

import java.util.Arrays;
import java.util.Scanner;

//Complexity = O(n)
public class AnagramChecker {

	static boolean isAnagram(String a, String b) {
		int[] frequenciesA = new int[26];
		int[] frequenciesB = new int[26];
		char charA = ' ';
		char charB = ' ';

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				charA = a.toLowerCase().charAt(i);
				charB = b.toLowerCase().charAt(i);
				frequenciesA[charA - 'a']++;
				frequenciesB[charB - 'a']++;
				System.out.println(frequenciesA[charA - 'a'] + " " + frequenciesB[charB - 'a']);
			}
		} else {
			return false;
		}

		System.out.println(Arrays.equals(frequenciesA, frequenciesB));
		if (Arrays.equals(frequenciesA, frequenciesB)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
