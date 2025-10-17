package com.strings.programs;

public class RemoveAllWhitespaces {

	public static void main(String[] args) {

		String course = " java p r o g ramin g";
		
		String result = course.replaceAll(" ", "");
		System.out.println(result);
		
		
		/*String noWhiteSpace = "";
		for(int i = 0; i< course.length(); i++) {
			char c = course.charAt(i);
			if(c != ' ') {
				noWhiteSpace = noWhiteSpace + c;
			}
		}
		System.out.println(noWhiteSpace);*/
		
	}

}
