//Iterate over a HashMap

package com.collectionframework.programs;

import java.util.HashMap;
import java.util.Map;

public class IterateOverHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Java");
		hashMap.put(2, "Sql");
		hashMap.put(3, "Python");
		hashMap.put(4, "React");
		
		for(Map.Entry<Integer, String> e :hashMap.entrySet()) {
			System.out.println(e.getKey()+ " => "+ e.getValue());
		}
	}

}
