// Count Frequency of Each Element using HashMap

package com.collectionframework.programs;
import java.util.*;

public class CountFrequency {

	public static void main(String[] args) {
		String name = "java";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : name.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
			
		}
		System.out.println(map);
	}

}
