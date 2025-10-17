// Reverse a String

package com.strings.programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "chandana";
		String reverseStr = " ";
		
		System.out.print("After revers a String :");
		char[] c =str.toCharArray();
		for(int i =c.length-1; i >= 0; i--) {
			reverseStr +=c[i];
			
		}
		System.out.println(reverseStr);
	}

}
