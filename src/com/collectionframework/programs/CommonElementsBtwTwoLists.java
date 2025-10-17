// Find Common Elements Between Two Lists

package com.collectionframework.programs;
import java.util.*;

public class CommonElementsBtwTwoLists {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
		
		list1.retainAll(list2);
		
		System.out.println("common elements between two lists : "+list1);
	}

}
