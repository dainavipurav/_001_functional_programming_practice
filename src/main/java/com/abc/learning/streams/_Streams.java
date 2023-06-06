package com.abc.learning.streams;

import java.util.Arrays;
import java.util.List;

public class _Streams {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Maria", Gender.FEMALE), 
				new Person("Ismail", Gender.MALE),
				new Person("Dainavi", Gender.FEMALE), 
				new Person("Abhay", Gender.MALE),
				new Person("Komal", Gender.FEMALE)
				);
		
		System.out.println("Is all females : "+persons.stream().allMatch(t -> t.gender.equals(Gender.FEMALE)));
		System.out.println("Is any females : "+persons.stream().anyMatch(t -> t.gender.equals(Gender.FEMALE)));
		System.out.println("Is any unknown gender : "+persons.stream().noneMatch(t -> t.gender.equals(Gender.UNKNOWN)));
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
		FEMALE, MALE,UNKNOWN
	}
}
