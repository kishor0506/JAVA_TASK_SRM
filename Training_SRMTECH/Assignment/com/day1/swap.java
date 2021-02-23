package com.day1;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		System.out.println("enter A number =");
		System.out.println("enter B number =");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		A = A - B;
		B = A + B;
		A = B - A;
		System.out.println("a number=" + A);
		System.out.println("b number=" + B);

	}

}
