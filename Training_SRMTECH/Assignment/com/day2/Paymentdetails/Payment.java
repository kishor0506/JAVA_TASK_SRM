package com.day2.Paymentdetails;

public class Payment implements Paymentmode {
	private String paytype;
	private float amount;
	private int acc_no;
	private String str;
	private String str2;
	private int cvv;

    public Payment(String paytype, float amount) {
        this.paytype = paytype;
        
        this.amount = amount;
    }

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Payment [paytype=" + paytype + ", amount=" + amount + ", acc_no=" + acc_no + ", str=" + str + ", str2="
				+ str2 + ", cvv=" + cvv + "]";
	}

	@Override
	public void Accountdetails(long acc_no, String ifsc, String mmid, int ph_no) {
		this.Accountdetails(acc_no, ifsc, mmid, ph_no);
		if(this.acc_no<5) {
			str="invalid account number";
		}
		else {
			str="payment successful";
		}
	
	}

	@Override
	public void Carddetails(long card_no, String cvv, String name) {
		this.Carddetails(card_no, cvv, name);
		if(this.cvv>3) {
			str2 = "invalid cvv";
		}
		else {
			str2="payment sucessful";
		}
		
	}

	@Override
	public void Cod(String address, String loction, String ph_no) {
		
	
	}

	@Override
	public void UPi(String name, String upiadd) {
		
	
	}

	public void doPayment() {
	
		
	}

}
