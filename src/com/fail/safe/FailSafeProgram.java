package com.fail.safe;

import java.util.concurrent.CopyOnWriteArrayList;

//•	Fail-safe: Works on a copy of the collection → no error if changed.
public class FailSafeProgram {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("chandana");
		list.add("poojitha");
		
		for(String s : list) {
			System.out.println(s);
			list.add("Raju"); // no error here
		}
	}

}
