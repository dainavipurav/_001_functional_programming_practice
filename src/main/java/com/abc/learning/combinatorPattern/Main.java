package com.abc.learning.combinatorPattern;

import java.time.LocalDate;

import com.abc.learning.combinatorPattern.StudentCombinatorValidationService.ValidationResult;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Dainavi", "dainavipurav@gmail.com", "+005218582", LocalDate.of(2000, 1, 10));

		// Using normal validations
		StudentValidationService studentValidationService = new StudentValidationService();

		System.out.println("Normal validation result : " + studentValidationService.isValidStudent(student));
		// Using normal validations

		// Using Combinator validations
		ValidationResult result = StudentCombinatorValidationService.isEmailValid()
				.and(StudentCombinatorValidationService.isPhoneValid())
				.and(StudentCombinatorValidationService.isAdult()).apply(student);

		System.out.println("Combinator pattern validation result : " + result);

		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
		// Using Combinator validations
	}

}
