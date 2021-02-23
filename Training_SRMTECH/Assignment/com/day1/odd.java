package com.day1;

public class odd {

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2, 569, 89, 26 };
		System.out.println("Odd Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
}
