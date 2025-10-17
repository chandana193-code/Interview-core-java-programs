//Check if a Number is Strong

package com.numbers.programs;

public class StrongNumber {

	public static void main(String[] args) {

		int num = 145;
		int orgNum = num;
		int sum = 0;
		int remainder;

		while (num > 0) {
			remainder = num % 10;
			int factorial = 1;

			for (int i = 1; i <= remainder; i++) {

				factorial = factorial * i;

			}
			sum += factorial;
			num /= 10;
		}

		if (sum == orgNum) {
			System.out.println("Given number is a Strong number");
		} else {
			System.out.println("Given number is not a Strong number");
		}
	}

}
