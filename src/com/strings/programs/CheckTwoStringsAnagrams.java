package com.strings.programs;

public class CheckTwoStringsAnagrams {
	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		
		boolean result =areAnagrams(str1, str2);
		if(result) {
			System.out.println("Given strings are an anagrams");
		}else {
			System.out.println("Given strings are not an anagrams");
		}
	}
    public static boolean areAnagrams(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			count1[s1.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			count2[s2.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(count1[i] != count2[i]) {
				return false;
			}
		}
		return true;
	}

}
