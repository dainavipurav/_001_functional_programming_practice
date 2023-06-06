package com.abc.learning.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;


///Normal Validation functions
public class StudentValidationService {
	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneValid(String phone) {
		return phone.startsWith("+0");
	}

	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 18;
	}

	public boolean isValidStudent(Student student) {
		return isEmailValid(student.getEmail()) && isPhoneValid(student.getPhone()) && isAdult(student.getDob());
	}
}
