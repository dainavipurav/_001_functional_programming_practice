package com.abc.learning.functionInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer takes single argument and returns nothing or void
//BiConsumer takes 2 arguments and returns nothing or void
public class _Consumer {
	public static void main(String[] args) {

		Student student = new Student("Dainavi Purav", 26);
		boolean isPresent = true;

		// Normal function
		showStudentDetails(student);
		showStudentDetails2(student,isPresent);

		// Using functional interface (Consumer)
		showStudentDetails.accept(student);

		// Using functional interface (BiConsumer)
		showStudentDetails2.accept(student, isPresent);

	}

	// Normal Function
	static void showStudentDetails(Student student) {
		System.out.println("Student Details : \nName : " + student.name + "\nAge : " + student.age + "\n");
	}

	static void showStudentDetails2(Student student, boolean isPresent) {
		if (isPresent) {

			System.out.println("Student Details : \nName : " + student.name + "\nAge : " + student.age
					+ "\nAttendance Status : Present \n");
		} else {
			System.out.println("Student Details : \nName : " + student.name + "\nAge : " + student.age
					+ "\nAttendance Status : Absent \n");
		}
	}
	// Normal Function

	// Using functional interface Consumer
	static Consumer<Student> showStudentDetails = st -> {
		System.out.println("Student Details : \nName : " + st.name + "\nAge : " + st.age + "\n");
	};

	// Using functional interface BiConsumer
	static BiConsumer<Student, Boolean> showStudentDetails2 = (student, isPresent) -> {
		if (isPresent) {

			System.out.println("Student Details : \nName : " + student.name + "\nAge : " + student.age
					+ "\nAttendance Status : Present \n");
		} else {
			System.out.println("Student Details : \nName : " + student.name + "\nAge : " + student.age
					+ "\nAttendance Status : Absent \n");
		}
	};

	static class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "_Consumer [name=" + name + ", age=" + age + "]";
		}

	}
}
