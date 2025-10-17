// Sort a Map by Values

package com.collectionframework.programs;
import java.util.*;

public class SortMapByValues {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("b", 2);
		map.put("a", 1);
		map.put("c", 3);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
