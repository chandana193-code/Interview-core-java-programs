//Check if a Number is Prime

package com.numbers.programs;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 13;
		boolean isPrime = true;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Given number is Prime number");
		}else {
			System.out.println("Given number is not a prime number");
		}
	}

}
