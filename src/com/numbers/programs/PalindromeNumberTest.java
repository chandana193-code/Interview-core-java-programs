//Check if a Number is Palindrome

package com.numbers.programs;

public class PalindromeNumberTest {

	public static void main(String[] args) {

		int num = 121;
		int orgNum = num;
		int reverseNum = 0;
		int remainder;
		
		while(num > 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Original number : "+orgNum + " "+"Modifing number : "+reverseNum);
		if(orgNum == reverseNum) {
			System.out.println("Given number is a palindrome number");
		}else {
			System.out.println("Given number is not a palindrome number");
		}
	}

}
