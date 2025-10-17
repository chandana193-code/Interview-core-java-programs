//Count Vowels and Consonants

package com.strings.programs;

public class CountVowelsAndConsonants {

	public static void countVowelsAndConsonants(String s) {
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U') {
					vowels++;
				} else {
					consonants++;
				}
			}

		}
		System.out.println("vowel count : "+vowels);
		System.out.println("consonant count : "+consonants);

	}

	public static void main(String[] args) {

		String name = "education";
		countVowelsAndConsonants(name);
	}

}
