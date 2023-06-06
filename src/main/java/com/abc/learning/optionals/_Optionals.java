package com.abc.learning.optionals;

import java.util.Optional;

public class _Optionals {
	public static void main(String[] args) {
		Object value = Optional.ofNullable(null).orElseGet(() -> "Default value");
		System.out.println(value);
		
		Optional.ofNullable("dainavipurav@gmail.com")
		.ifPresentOrElse(email->System.out.println("email : "+email), () -> {
			System.out.println("No email available");
		});
	}
}
