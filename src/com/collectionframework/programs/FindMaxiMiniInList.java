// Find Maximum and Minimum in a List

package com.collectionframework.programs;
import java.util.*;

import java.util.Arrays;

public class FindMaxiMiniInList {

	public static void main(String[] args) {
    
		List<Integer> list = Arrays.asList(20, 4, 6, 44, 7, 8);
		System.out.print("Maximum element : ");
		System.out.println(Collections.max(list));
		System.out.print("Minimum element : ");
		System.out.println(Collections.min(list));
	}

}
