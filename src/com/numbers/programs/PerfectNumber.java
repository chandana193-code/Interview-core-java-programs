//Check if a Number is Perfect

package com.numbers.programs;

public class PerfectNumber {

	public static void main(String[] args) {

		int num = 28;
		int sum =0;
		
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(num == sum) {
			System.out.println("Given number is Perfect Number");
		}else {
			System.out.println("Given number is not Perfect Number");
		}
	}

}
