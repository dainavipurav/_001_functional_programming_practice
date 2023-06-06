package com.abc.learning.functionInterfaces;

import java.util.function.Function;

//It takes 1 args and returns result
public class _Functions {
	public static void main(String[] args) {
		
		int numToCalculate = 4;
		
		//Normal Approach
		int increment = incrementByOne(numToCalculate);
		System.out.println("Increment by 1 : "+ increment);
		//Normal Approach
		
		System.out.println();
		
		//Using functional interface
		int increment2 = incrementByOneFunction.apply(numToCalculate);
		System.out.println("Increment by 1 : "+ increment2);
		
		int multiply = multiplyBy10.apply(increment2);
		
		System.out.println("Multiply by 10 : "+ multiply);
		
		int addBy1AndThenMultiplyBy10 = addBy1AndThemMultiplyBy10.apply(numToCalculate);
		System.out.println("\nAdd by 1 and then multiply by 10 : "+ addBy1AndThenMultiplyBy10);	
		
		//Using functional interface
	}
	
	//Normal approach
	private static int incrementByOne(int num) {
		return num+1;
	}
	
	//Using functional interface Normal functions
	static Function<Integer, Integer> incrementByOneFunction = num -> num+1;
	
	static Function<Integer, Integer> multiplyBy10 = num -> num*10;
	
	//Using functional interface Chaining Functions
	static Function<Integer, Integer> addBy1AndThemMultiplyBy10 = num -> incrementByOneFunction.andThen(multiplyBy10).apply(num); 
}
