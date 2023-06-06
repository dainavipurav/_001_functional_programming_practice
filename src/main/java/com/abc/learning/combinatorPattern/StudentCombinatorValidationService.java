package com.abc.learning.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import com.abc.learning.combinatorPattern.StudentCombinatorValidationService.*;

public interface StudentCombinatorValidationService extends Function<Student, ValidationResult> {

	static StudentCombinatorValidationService isEmailValid() {
		return student -> student.getEmail().contains("@") ? ValidationResult.SUCCESS
				: ValidationResult.EMAIL_NOT_VALID;
	}

	static StudentCombinatorValidationService isPhoneValid() {
		return student -> student.getPhone().startsWith("+0") ? ValidationResult.SUCCESS
				: ValidationResult.PHONE_NOT_VALID;
	}

	static StudentCombinatorValidationService isAdult() {
		return student -> Period.between(student.getDob(), LocalDate.now()).getYears() >= 18 ? ValidationResult.SUCCESS
				: ValidationResult.NOT_AN_ADULT;
	}

	default StudentCombinatorValidationService and(StudentCombinatorValidationService other) {
		return student -> {
			ValidationResult result = this.apply(student);
			return result.equals(ValidationResult.SUCCESS) ? other.apply(student) : result;
		};
	}

	enum ValidationResult {
		SUCCESS, EMAIL_NOT_VALID, PHONE_NOT_VALID, NOT_AN_ADULT
	}

}
