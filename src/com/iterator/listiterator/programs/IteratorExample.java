package com.iterator.listiterator.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("chandana");
		list.add("poojitha");
		list.add("ramya");
		list.add("rani");
		
		// using iterator
		System.out.println("using Iteratior");
		System.out.println();
		Iterator<String> iterator = list.iterator();
		
		  while(iterator.hasNext()) {
		   System.out.println(iterator.next());
		  }
		  
		   System.out.println();
		  // Using list iterator
		  System.out.println("using List iterator (forword & backword)");
		  System.out.println();
		  ListIterator<String> lI = list.listIterator();
		  
		  // forword
		  System.out.println("forword direction : ");
		  System.out.println();
		  while (lI.hasNext()) {
			  System.out.println(lI.next());
		  }
		  
		  System.out.println();
		  // backword
		  System.out.println("backword direction : ");
		  System.out.println();
		  while(lI.hasPrevious()) {
			  System.out.println(lI.previous());
		  }
		  
	}

}
