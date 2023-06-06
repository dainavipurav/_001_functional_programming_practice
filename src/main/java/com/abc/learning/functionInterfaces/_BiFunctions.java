package com.abc.learning.functionInterfaces;

import java.util.function.BiFunction;

//It takes 2 args and returns result
public class _BiFunctions {
	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 5;
		
		//Normal Approach
		int addition = addition(num1, num2);
		System.out.println("Addition is : "+addition);
		//Normal Approach
		
		//Using function interface (BiFunction)
		int addition2 = addtionUsingFunctionalInterface.apply(num1,num2);
		System.out.println("Addition is : "+addition2);
		//Using function interface (BiFunction)
		
	}
	
	//Normal approach
	static int addition(int num1,int num2) {
		return num1+num2;
	}
	
	//Using function interface (BiFunction)
	static BiFunction<Integer, Integer, Integer> addtionUsingFunctionalInterface = (num1,num2) -> num1+num2; 
}
