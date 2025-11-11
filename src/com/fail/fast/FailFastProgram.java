package com.fail.fast;

import java.util.ArrayList;
import java.util.List;

// •Fail-fast: Directly works on the main collection → throws error if changed.
public class FailFastProgram {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("chandana");
		list.add("Poojitha");
		
		for(String s : list) {
			System.out.println(s);
			list.add("Raju"); //  it gives - java.util.ConcurrentModificationException
		}
	}

}
