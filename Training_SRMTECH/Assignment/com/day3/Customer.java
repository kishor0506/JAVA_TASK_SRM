package com.day3;

public class Customer implements Comparable<Customer>{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private Integer age;

	public Customer(String firstname, String lastname, String email, Integer age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
	}


	

	public Customer(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}




	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return o.getFirstname().compareTo(this.getEmail());
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", age=" + age
				+ "]";
	}




	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
