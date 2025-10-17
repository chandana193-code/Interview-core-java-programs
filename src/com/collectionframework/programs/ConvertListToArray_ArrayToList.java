//Convert List to Array and Array to List

package com.collectionframework.programs;

import java.util.*;

public class ConvertListToArray_ArrayToList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("chandana", "poojitha"));
		//System.out.println(list);
		String[] arr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		List<String> newList = Arrays.asList(arr);
		System.out.println(newList);
		
		/*System.out.println(arr.getClass().getName());       // prints [Ljava.lang.String;
		System.out.println(newList.getClass().getName());     // prints java.util.Arrays$ArrayList
		*/
	}

}
