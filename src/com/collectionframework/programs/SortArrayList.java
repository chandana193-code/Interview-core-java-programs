// Sort an ArrayList of Strings

package com.collectionframework.programs;
import java.util.*;

public class SortArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Banana", "apple", "orange", "grape"));
		 Collections.sort(arrList); // it will give answer like this [Banana, apple, grape, orange] 
		//Collections.sort(arrList, String.CASE_INSENSITIVE_ORDER); // it will give answer like this [apple, Banana, grape, orange]
		System.out.println(arrList);
	}

}
