package com.day1;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.println("enter the name:");
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		String variable = val.toLowerCase();
		char[] name = variable.toCharArray();
		for (int i = 0; i < name.length; i++) {

			if (name[i] == 'a' || name[i] == 'e' || name[i] == 'i' || name[i] == 'o' || name[i] == 'u') {
				System.out.println("vowel " + name[i]);
			}

		}
	}
}