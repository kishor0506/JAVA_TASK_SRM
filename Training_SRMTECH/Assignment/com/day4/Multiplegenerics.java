package com.day4;

public class Multiplegenerics {


	public static void main(String[]args) {
		mybound<ktm> mb= new mybound(new ktm());
		mb.brake();
		mb.brake2();
		
		
	}
}

interface Abs_controls{
	public void abs();
	 public void cornerning_abs();
	
}
class ktm implements Abs_controls{

	@Override
	public void abs() {
		System.out.println("--abs is available--");
		
	}

	@Override
	public void cornerning_abs() {
		System.out.println("--cornering abs is not available--");
		
	}
	 
class bajaj implements Abs_controls{

	@Override
	public void abs() {
		System.out.println("--abs is available--");
		
	}

	@Override
	public void cornerning_abs() {
		System.out.println("--abs is available--");
		
	}
	
}
}
class mybound<T extends ktm & Abs_controls>{
	T obj;
	mybound(T obj ){
	this.obj=obj;
	}
	public void brake() {
		this.obj.abs();
	}
	public void brake2() {
		this.obj.cornerning_abs();
	}
}
/*
 class Bound<T extends A> 
{ 
       
    private T objRef; 
       
    public Bound(T obj){ 
        this.objRef = obj; 
    } 
       
    public void doRunTest(){ 
        this.objRef.displayClass(); 
    } 
} 
   
class A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside super class A"); 
    } 
} 
   
class B extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside sub class B"); 
    } 
} 
   
class C extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside sub class C"); 
    } 
} 
  
public class BoundedClass 
{ 
    public static void main(String a[]) 
    { 
          
        // Creating object of sub class C and  
        // passing it to Bound as a type parameter. 
        Bound<C> bec = new Bound<C>(new C()); 
        bec.doRunTest(); 
          
        // Creating object of sub class B and  
        // passing it to Bound as a type parameter. 
        Bound<B> beb = new Bound<B>(new B()); 
        beb.doRunTest(); 
          
        // similarly passing super class A 
        Bound<A> bea = new Bound<A>(new A()); 
        bea.doRunTest(); 
          
    } 
} 
 */
 
