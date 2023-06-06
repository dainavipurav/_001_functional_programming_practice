package com.abc.learning.approaches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative {
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Maria", Gender.FEMALE), 
				new Person("Ismail", Gender.MALE),
				new Person("Dainavi", Gender.FEMALE), 
				new Person("Abhay", Gender.MALE),
				new Person("Komal", Gender.FEMALE)
				);
		
		//Imperative Approach
		System.out.println("//Imperative Approach");
		List<Person> females = new ArrayList<>();
		
		for(Person person : persons) {
			if(person.gender.equals(Gender.FEMALE)) {
				females.add(person);
			}
		}
		
		for(Person female : females) {
			System.out.println(female);
		}
		//Imperative Approach
		
		//Declarative Approach
		System.out.println("\n//Declarative Approach");
		persons.stream()
		.filter(person -> person.gender.equals(Gender.FEMALE))
		.forEach(System.out::println);
		//Declarative Approach

	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		FEMALE, MALE
	}
}
