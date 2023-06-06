package com.abc.learning.combinatorPattern;

import java.time.LocalDate;

public class Student {
	private String name;
	private String email;
	private String phone;
	private LocalDate dob;

	public Student(String name, String email, String phone, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob + "]";
	}

}
