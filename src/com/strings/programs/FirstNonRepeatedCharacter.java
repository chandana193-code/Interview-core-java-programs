//Find First Non-Repeated Character

package com.strings.programs;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String name = "chandana";
		char firstUnique ='\0';
		
		for(int i = 0; i < name.length(); i++) {
			boolean repeated  = false;
			for(int j = 0; j < name.length(); j++) {
				if(i != j && name.charAt(i) == name.charAt(j)) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				firstUnique = name.charAt(i);
				break;
			}
			}
			System.out.print("First non repeted character : "+ firstUnique );
		
		
	}

}
