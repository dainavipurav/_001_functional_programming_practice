package com.abc.learning.functionInterfaces;

import java.util.function.Predicate;

//Predicate Takes single args and returns boolean result
//BiPredicate Takes two args and returns boolean result
public class _Predicates {
	public static void main(String[] args) {
		String phone = "09832752858326573";
		
		//Normal functions
		boolean isValid = isValid(phone);
		System.out.println("Your phone number is "+phone);
		System.out.println(isValid ? "It's valid number" : "It's not valid number" );
		System.out.println("The phone number contains 3 and is valid number : "+isValidAndContains3(phone));
		System.out.println("The phone number contains 3 or is valid number : "+isValidOrContains3(phone));
		
		//Normal functions
		
		System.out.println();
		
		//Using Predicates
		boolean isValid2 = isValidByPredicate.test(phone);
		System.out.println("Your phone number is "+phone);
		System.out.println(isValid2 ? "It's valid number" : "It's not valid number" );
		System.out.println("The phone number contains 3 and is valid number : "+isValidAndContains3ByPredicate.test(phone));
		System.out.println("The phone number contains 3 or is valid number : "+isValidOrContains3ByPredicate.test(phone));
		//Using Predicates
	}
	
	static boolean isValid(String phone) {
		return phone.startsWith("0") ? true : false; 
	}
	
	static boolean isValidAndContains3(String phone) {
		return isValid(phone) && phone.contains("3"); 
	}
	
	static boolean isValidOrContains3(String phone) {
		return isValid(phone) || phone.contains("3"); 
	}
	
	static Predicate<String> isValidByPredicate = phone -> phone.startsWith("0") ? true : false; 
	static Predicate<String> isContains3ByPredicate = phone -> phone.contains("3") ? true : false;

	//And predicate
	static Predicate<String> isValidAndContains3ByPredicate = phone -> isValidByPredicate.and(isContains3ByPredicate).test(phone); 
	
	//Or predicate
	static Predicate<String> isValidOrContains3ByPredicate = phone ->isValidByPredicate.or(isContains3ByPredicate).test(phone);
}
