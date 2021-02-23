package com.day1;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("enter the name");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		char[] ch = string1.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
			;
		}

	}

}
