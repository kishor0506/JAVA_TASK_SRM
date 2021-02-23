package com.day2.Shipping;

import java.util.Date;

public class Shipping {
	private int pid;
	private String pname;
	private String prdtype;
	private float pamount;
	private int qty;
	private String address;
	private String location;
	private Date shdate;
	
	
	
	
	
	public Shipping(int pid, String pname, String prdtype, float pamount, int qty, String address, String location,
			Date shdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prdtype = prdtype;
		this.pamount = pamount;
		this.qty = qty;
		this.address = address;
		this.location = location;
		this.shdate = shdate;
	}





	@Override
	public String toString() {
		return "Shipping pid=" + pid + ", pname=" + pname + ", prdtype=" + prdtype + ", pamount=" + pamount + ", qty="
				+ qty + ", address=" + address + ", location=" + location + ", shdate=" + shdate + "";
	}














public void showShipping() {
		// TODO Auto-generated method stub
		
	}
	
	

}
