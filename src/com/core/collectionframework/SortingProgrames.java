package com.core.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingProgrames {

	public static void main(String[] args) {
		List<String> data = new ArrayList<String>(Arrays.asList("java","zjava","aJava"));
		/*
		 * Collections.sort(data,String.CASE_INSENSITIVE_ORDER.reversed());
		 * System.out.println(data);
		 */
		
		Collections.sort(data, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
		System.out.println(data);

	}

}
