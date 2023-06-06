package com.abc.learning.functionInterfaces;

import java.util.function.Supplier;

//Used to supply or get  its return any type of value
public class _Supplier {
	public static void main(String[] args) {
		//Normal function call
		System.out.println("My db name : "+getDbName());
		
		System.out.println();
		
		//Using Functional Programming
		System.out.println("My db name : "+getDbNameBySupplier.get());
	}
	
	static String getDbName() {
		return "users";
	}
	
	static Supplier<String> getDbNameBySupplier = () -> "users";
}
