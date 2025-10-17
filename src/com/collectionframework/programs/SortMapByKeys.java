// Sort a Map by Keys

package com.collectionframework.programs;
import java.util.*;

public class SortMapByKeys {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("B", 1);
		map.put("A", 2);
		map.put("C", 3);
		
		Map<String, Integer> sorted = new TreeMap<String, Integer>(map);
		System.out.println(sorted);
	}

}
