package com.day2.Productdetails;



public class Product {
		private int pid;
	    private String name;
	    private int qty;
	    private long pnum;
	    private String prod;
	    private String type;
	    
public Product(int pid, String name, int qty, long pnum, String prod, String type) {
	super();
	this.pid = pid;
	this.name = name;
	this.qty = qty;
	this.pnum = pnum;
	this.prod = prod;
	this.type = type;
}
public void viewProduct()
{
	System.out.println(+pid);
}
@Override
public String toString() {
	return "pid=" + pid + ", name=" + name + ", qty=" + qty + ", pnum=" + pnum + ", prod=" + prod + ", type="
			+ type ;
}
}
