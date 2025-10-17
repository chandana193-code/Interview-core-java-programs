// Iterate over an ArrayList

package com.collectionframework.programs;
import java.util.*;

public class IterateArrayList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("chandana");
		list.add("Akila");
		list.add("poojitha");
		list.add("sreeja");
		list.add("banu");
		
		for(String listOfNames : list) {
			System.out.println(listOfNames);
		}
	}

}
