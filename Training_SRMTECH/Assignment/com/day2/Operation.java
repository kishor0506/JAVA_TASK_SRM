package com.day2;


import com.day2.CashWithdrawal;
import com.day2.CustomerBankDetails;

public class Operation extends CustomerBankDetails implements CashWithdrawal,BalanceInquiry{
	String CustName,Email,BankName;
	Long AccountNo,PhoneNo;
	double Amount=0;
	public Operation(String CustName,String Email,String BankName,Long AccountNo,Long PhoneNo,double Amount) {
	super(CustName,Email,BankName,AccountNo,PhoneNo);
	this.Amount=Amount;
    }
	public void getDetails() {
		System.out.println("Bank Name : "+super.BankName);
		System.out.println("Customer Name : "+super.CustName);
		System.out.println("Email-Id : "+super.Email);
		System.out.println("Account Number : "+super.AccountNo);
		System.out.println("Phone Number :  "+super.PhoneNo);
	}
	@Override
	public void checkBalance(double Amt) 
	{
		Amount=Amt;
		if(Amount<=0)
		{
			System.out.println("Minimum Balance Required Rs.500");
		}
		
		System.out.println("Available Balance : "+Amount);
	}
	
	@Override
	public void withdraw(double Amt) {
		if(Amt<=0) {
			System.out.println("Cannot Withdraw Amount Your Account have "+Amt+" Balnce");
		}
		else
		{
			this.Amount=this.Amount-Amt;
			System.out.println("Available Balance after Withdrawal : "+Amount);
		}
		
		
	}
}

interface i4 extends BalanceInquiry,CashWithdrawal
{
	
}