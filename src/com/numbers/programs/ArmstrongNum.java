//Check if a Number is Armstrong

package com.numbers.programs;

public class ArmstrongNum {

	public static void main(String[] args) {

		int number = 1634;
		int orgNum = number;
		int sum = 0;
		int digits = String.valueOf(number).length();
		int remainder;
		
		while(number > 0) {
			remainder = number%10;
			number = number / 10;
			sum = sum + (int)Math.pow(remainder, digits);
			
		}
		if(sum == orgNum) {
			System.out.println("Given number is an armstrong number");
		}else
		{
			System.out.println("Given number is not an armstrong number");
		}
	}

}
