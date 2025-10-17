//Check if a String is Palindrome

package com.strings.programs;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "malayalam";
		String originalStr = str;
		String reverseStr = "";
		
		char c[] = str.toCharArray();
		for(int i = c.length-1; i >= 0; i--) {
			reverseStr = reverseStr+c[i];
		}
		System.out.println("Before modification String : "+ originalStr);
		System.out.println("After modification String : "+ reverseStr);
		
		if(originalStr.equals(reverseStr)) {
			System.out.println("Given String is a Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome");
		}
	}

}
