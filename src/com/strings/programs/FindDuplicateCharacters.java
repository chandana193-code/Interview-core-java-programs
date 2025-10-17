//Find Duplicate Characters from string

package com.strings.programs;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		String name = "chandana";
		name = name.toLowerCase();
		char[] c = name.toCharArray();
		for(int i = 0; i<c.length; i++) {
			for(int j = i+1; j<c.length; j++) {
				
				if(c[i] == c[j] && c[i] != 'o') {
					System.out.println(c[i]);
					c[j] = 'o'; // c[j] = 'o'; means "mark this character as processed" or "ignore it next time."
					break;
				}
				
				}
			}
		
		}

}
