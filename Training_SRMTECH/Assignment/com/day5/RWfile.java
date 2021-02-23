package com.day5;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class RWfile {
	public static void main(String[] args) {
		try {
            FileReader fr = new FileReader("F:/Training_SRMTECH/Assignment/com/day5/input.txt");
           
            BufferedWriter bw = new BufferedWriter(new FileWriter("F:/Training_SRMTECH/Assignment/com/day5/output.txt"));
            int i;
            String str = "";
            while((i=fr.read())!=-1){
                str+=(char)i;
            }
            System.out.println("File Read!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println(str);
            bw.write(str);
            System.out.println("File written in another file!");
            fr.close();
            bw.close();
            FileReader frr = new FileReader("F:/Training_SRMTECH/Assignment/com/day5/output.txt");
            String str2 = "";
            int j;
            while((j=frr.read())!=-1){
                str2+=(char)j;
            }
            System.out.println("\nThe Outfile is:");
            System.out.println("------------------------------------------------------------------------");
            System.out.println(str2);
            frr.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}


