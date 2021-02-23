package com.day5;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Hashcode {

	public static void main(String[] args) {

			try {
	            FileReader fr = new FileReader("F:/Training_SRMTECH/Assignment/com/day5/input.txt");
	           
	            BufferedWriter bw = new BufferedWriter(new FileWriter("F:/Training_SRMTECH/Assignment/com/day5/output.txt"));
	            int i;
	            int f1, f2;
	            String str = "";
	            while((i=fr.read())!=-1){
	                str+=(char)i;
	            }
	            System.out.println("File Read!");
	            System.out.println("------------------------------------------------------------------------");
	            System.out.println(str);
	            bw.write(str);
	            System.out.println("File written in another file!");
	            f1= fr.hashCode();
	            System.out.println("\nHashCode of read file: "+f1);
	            FileReader fr1 = new FileReader("F:/Training_SRMTECH/Assignment/com/day5/output.txt");
	            f2 = fr1.hashCode();
	            System.out.println("\nHashCode of writen file: "+f2);
	            fr.close();
	            bw.close();
	            fr1.close();
	        } catch (Exception e) {
	            System.out.println("Error!");
	        }
	}
}