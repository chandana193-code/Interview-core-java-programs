//Find Factorial of a Number

package com.numbers.programs;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 4;
		int factorial = 1;
		
		for(int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Number factorial : " + factorial);
	}

}
