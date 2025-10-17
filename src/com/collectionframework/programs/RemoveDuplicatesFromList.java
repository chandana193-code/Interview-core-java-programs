//Remove Duplicates from a List

package com.collectionframework.programs;
import java.util.*;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 5);
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
 
	}

}
