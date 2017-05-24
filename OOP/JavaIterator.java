package com.hackerrank.OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<Object>();
		int n = scan.nextInt();
		int m = scan.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		scan.nextLine();
		list.add("###");
		for (int j = 0; j < m; j++) {
			list.add(scan.nextLine());
		}
		scan.close();

		@SuppressWarnings("rawtypes")
		// Iterator is used to iterate over collection objects (read and remove
		// functions)
		// Iterator object can be created by calling iterator() method present
		// in Collection interface
		//Iterator it = list.iterator();

		Iterator it1 = func(list);

		// checking the next element availability
		while (it1.hasNext()) {
			// moving cursor to next element
			Object element = it1.next();
			//Printing the next element
			System.out.println(element.toString());

		}
	}

	private static Iterator<Object> func(ArrayList<Object> list) {
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String && element.equals("###")) {
				break;
			}
		}
		return it;
	}

}
