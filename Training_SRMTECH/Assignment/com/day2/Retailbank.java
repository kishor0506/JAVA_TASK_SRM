package com.day2;

import java.util.Scanner;

public class Retailbank {

	public static void main(String[] args) {
		String BName,Email,CName;
		Long Accno,Phone;
        double Amt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bank Name : ");
		BName=sc.next();
	    System.out.println("Enter the Customer Name : ");
		CName=sc.next();
		System.out.println("Enter the Email-Id : ");
        Email=sc.next();
        System.out.println("Enter the Account Number : ");
        Accno=sc.nextLong();
        System.out.println("Enter the Phone Number : ");
        Phone=sc.nextLong();
        System.out.println("Enter the Balance Amount : ");
        Amt=sc.nextDouble();
        Operation bankoper=new Operation(CName,BName,Email,Accno,Phone,Amt);
        bankoper.getDetails();
        if(Amt<=0)
        {
        	System.out.println("Minimum Balance of Rs.500 Mandatory");
        }
        System.out.println("Enter the Bank Operations "+"\n1.Balance Enquiry"+"\n2.Cash Withdrawal");
        System.out.println("Enter the Case Number : ");
        int op=sc.nextInt();
        switch(op)
        {
           case 1: 
        	       bankoper.checkBalance(Amt);
        	       break;
           case 2:
                  System.out.println("Enter the Amount to Withdraw : ");
                  double amt=sc.nextDouble();
	       		  bankoper.withdraw(amt);
	              break;
          
          default : System.out.println("Invalid Operation");
        }
	}




	}


