//Count Occurrences of Each Character

package com.strings.programs;

import java.util.*;

public class CountOccurEachCharacter {

	public static void main(String[] args) {
        String str = "chandana";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			if(c != ' ') {
				hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
			}
		}
		
		System.out.println("character count : "+hashMap);
	}

}
