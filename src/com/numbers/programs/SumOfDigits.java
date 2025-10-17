// Find the Sum of Digits of a Number

package com.numbers.programs;

public class SumOfDigits {

	public static void main(String[] args) {

		int number = 12345;
		int sum = 0;
		int remainder;
		
		while(number != 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		System.out.println("sum of number digits : "+ sum);
	}

}
