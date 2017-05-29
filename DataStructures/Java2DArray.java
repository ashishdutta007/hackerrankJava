package com.hackerrank.DataStructures;

import java.util.Scanner;

public class Java2DArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = scan.nextInt();
			}
			scan.nextLine();
		}
		scan.close();
		// Print input 2D array
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("\n");
		}

		int sum = 0, largestSum = -325;

		for (int imin = 0, imax = 2; imin <= 3 && imax <= 5; imin++, imax++) {
			for (int jmin = 0, jmax = 2; jmin <= 3 && jmax <= 5; jmin++, jmax++) {
				sum = 0;
				for (int i = imin; i <= imax; i++) {
					for (int j = jmin; j <= jmax; j++) {
						System.out.println("-------values-----");
						System.out.println("imin: " + imin + " imax: " + imax + " jmin: " + jmin + " jmax: " + jmax
								+ " i: " + i + " j: " + j);
						if (i == (imin + imax) / 2) {
							if (j == jmin || j == jmax) {
								continue;
							} else {
								sum = sum + array[i][j];
							}
						} else {
							sum = sum + array[i][j];
						}
					}
				}
				System.out.println("Sum: " + sum);
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
		}
		System.out.println("Largest Sum: " + largestSum);
	}
}
