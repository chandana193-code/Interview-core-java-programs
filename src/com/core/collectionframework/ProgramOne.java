package com.core.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class ProgramOne {

	public static void main(String[] args) {

		//remDuplicate();
		//frequency();
		//nonRep();
		//sortMap();
		//sortMapByNumber();
		//comman();
		//converting();
		//removeNull();
		
		String s1 = "Java";     // Stored in String Constant Pool
		 String s2 = "Java";     // Reuses the same object from SCP
		 String s3 = new String("Java"); // Created in heap memory, outside SCP
		 String s4 = s3.intern();   // Moves/links to SCP reference

		 System.out.println(s1 == s2); // true → both point to same SCP object
		 System.out.println(s1 == s3); // false → s3 is in heap, not SCP
		 System.out.println(s1 == s4); // true → s4 refers to SCP string
		
		
		
	}
	//Remove Duplicates from an ArrayList
	public static void remDuplicate() {
		List<Integer> arr = new ArrayList(Arrays.asList(10, 20, 30, 10 , 20));
		arr.add(40);
		arr.add(10);
		Set<Integer> set = new LinkedHashSet<Integer>(arr);
		System.out.println(set);
	}

	//Find Frequency of Each Element
	
	public static void frequency() {
		List<String> arr = Arrays.asList("java","ruby","python","java");
		//HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		String characters ="nalla chandana";
		
		
		char[] c = characters.toCharArray();
		for(Character character : c) {
			if(character != ' ') {
				map.put(character, map.getOrDefault(characters, 0)+1);
			}
			
		}
		System.out.println(map);
		
		/*
		 * for(String s : arr) { if(hashMap.containsKey(s)) { hashMap.put(s,
		 * hashMap.get(s)+1); }else { hashMap.put(s, 1); } }
		 * System.out.println(hashMap);
		 */
		
		/*
		 * for(String s : arr) { hashMap.put(s, hashMap.getOrDefault(s, 0)+1); }
		 * System.out.println(hashMap);
		 */
		
		//java = 2, ruby = 1, python = 1
		
	}
	
	// Find the First Non-Repeated Element
	
	public static void nonRep() {
		String name = "chandana";
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		
		
		char[] c = name.toCharArray();
		
		for(Character character : c) {
			lhm.put(character, lhm.getOrDefault(character, 0)+1);
		}
		
		
		for(Map.Entry<Character, Integer> map : lhm.entrySet() ) {
			if(map.getValue() == 1) {
				System.out.println(map.getKey());
				break;
			}
		}
	}
	
	
	//Sort Map by Values
	
	public static void sortMap() {
		Map<Integer,String > map = new HashMap<Integer, String>();
		map.put(1, "barret");
		map.put(3, "pple");
		map.put(2, "aanana");
		
		
		
		System.out.println(map);
		
		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		
		System.out.println(list);
		
		
		Collections.sort(list,new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
			
			
		});
		
		
		list.forEach(System.out::println);
		
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
	}
	
	public static void sortMapByNumber() {
		Map<String,Integer > map = new HashMap<String,Integer >();
		map.put("barret", 3);
		map.put("pple", 1);
		map.put("aanana", 2);
		
		
		
		System.out.println(map);
		
		List<Map.Entry<String,Integer >> list = new ArrayList<Map.Entry<String,Integer >>(map.entrySet());
		
		System.out.println(list);
		
		
		Collections.sort(list,new Comparator<Map.Entry<String,Integer >>() {

			@Override
			public int compare(Map.Entry<String,Integer > o1, Map.Entry<String,Integer > o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
			
			
		});
		
		
		list.forEach(System.out::println);
		
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
	}
	
	public static void comman() {
		List<Integer> l1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
        List<Integer> l2 = new ArrayList(Arrays.asList(3, 4, 5, 6));
        l1.retainAll(l2);
        System.out.println(l1);
	}
	
	public static void converting() {
		String[] arr = {"A", "B", "C"};
		
	    for(String a : arr) {
	    	System.out.print(a);
	    }
	    System.out.println();
		List<String> list = Arrays.asList(arr);
		System.out.println("List : "+list);
		
		ArrayList<String> newArrayList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("ArrayList : "+newArrayList);
		
		String[] backToArray = list.toArray(new String[0]);
		System.out.println("back to array : "+ Arrays.toString(backToArray));
	}
	
	//Remove Null Values from a List
	
	public static void removeNull() {
		List<String> list = new ArrayList<String>(Arrays.asList("A",null,"B","C",null,"D"));
		list.removeIf(Objects::isNull);
		System.out.println(list);
	}
	
	
}
