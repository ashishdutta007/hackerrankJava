package com.hackerrank.DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testinputs, numofdigits, queries, x, y;

		testinputs = scan.nextInt();
		scan.nextLine();

		// Declaring An ArrayList of ArrayLists
		List<ArrayList<Integer>> numLists = new ArrayList<ArrayList<Integer>>();

		// Getting the inputs for the dynamic array
		for (int i = 0; i < testinputs; i++) {
			numofdigits = scan.nextInt();
			// Creating an ArrayList to store that line of digits
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for (int j = 0; j < numofdigits; j++) {
				numList.add(scan.nextInt());
			}
			numLists.add(numList);
			scan.nextLine();
		}

		// Using iterator to print the elements of the List
		/*for (ArrayList<Integer> arrayList : numLists) {
			Iterator<Integer> it = arrayList.iterator();
			while (it.hasNext()) {
				System.out.print(it.next() + " ");
			}
			System.out.println();
		}*/

		queries = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < queries; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			//System.out.println("x: " + x + " y: " + y);
			try {
				System.out.println(numLists.get(x - 1).get(y - 1));
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("ERROR!");
			}
			scan.nextLine();
		}
		scan.close();
	}
}
