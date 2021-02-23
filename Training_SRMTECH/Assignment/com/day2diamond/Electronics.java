package com.day2diamond;

import java.util.Scanner;


public class Electronics {

	public static void main(String[] args) {
		String name, brand, variant, color;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Electronics type Name : ");
		name = sc.next();
		System.out.println("Enter the Brand Name : ");
		brand = sc.next();
		System.out.println("Enter the Variant : ");
		variant = sc.next();
		System.out.println("Enter the Color : ");
		color = sc.next();
		Elect et = new Elect(name, brand, variant, color);
		et.getDetails();
		System.out.println("Enter the type "+"\n1.MOBILE"+"\n2.LAPTOP"+"\n3.IPAD");
		System.out.println("Enter the Case Number : ");
        int op=sc.nextInt();
        switch(op)
        {
           case 1: 
        	   System.out.println("Enter the mobile color: ");
               String mobile_color=sc.next();
        	       et.color(color);
        	       break;
           case 2:
                  System.out.println("Enter the Processor: ");
                  String processor=sc.next();
	       		  et.processor(processor);
	              break;
           case 3:

        	   System.out.println("Enter the Brand_name: ");
               String brand_name=sc.next();
	       		  et.brand_name(brand_name);
	              break;
          default : System.out.println("Invalid Operation");
        }
	}


	

}
