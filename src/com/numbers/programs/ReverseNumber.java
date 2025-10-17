/*
 🧠 Top 10 Java Number Programs
1️⃣ Check if a Number is Prime
2️⃣ Check if a Number is Even or Odd
3️⃣ Check if a Number is Armstrong
4️⃣ Check if a Number is Palindrome
5️⃣ Find Factorial of a Number
6️⃣ Print Fibonacci Series
7️⃣ Find the Sum of Digits of a Number
8️⃣ Find Reverse of a Number
9️⃣ Check if a Number is Perfect
🔟 Check if a Number is Strong
 */

// Find Reverse of a Number

package com.numbers.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123;
		int reverseNum = 0;
		int remainder;
		
		while(num > 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder ;
			num = num / 10;
		}
		System.out.println("reverse number : " + reverseNum);

	}

}
