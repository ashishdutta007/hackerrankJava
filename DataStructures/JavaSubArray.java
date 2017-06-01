package com.hackerrank.DataStructures;

import java.util.Scanner;

public class JavaSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		int sum = 0, negative = 0;

		// it = 1
		for (int it = 0; it < n; it++) {
			// imin=0,imax=1
			for (int imin = 0, imax = it; imax < n; imin++, imax++) {
				// i=(0,1)(1,2)
				for (int i = imin; i <= imax; i++) {
					System.out.println("i: " + i + " imin: " + imin + " imax: " + imax + " it: " + it);
					sum = sum + array[i];
				}
				System.out.println("Sum: " + sum);
				if (sum < 0) {
					negative++;
				}
				System.out.println("Negative array count: " + negative);
				sum = 0;
			}
		}
	}
}
