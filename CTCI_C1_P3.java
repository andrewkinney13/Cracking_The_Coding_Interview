// Andrew Kinney
// 8.28.2024
// Cracking the Coding Interview
// Chapter 1: Arrays and Strings
// Problem 1.2: check if one string is a permutation
// 				of another string

import java.util.Scanner;
import java.util.HashMap;

public class CTCI_C1_P3 {

	public static void main(String[] args) {

		// Obtain strings
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter string 2: ");
		String str2 = scanner.nextLine();
		scanner.close();
		
		// Check permutation
		if (isPermutation(str1, str2)) {
			System.out.println("Strings are permutations of each other!");
		}
		else {
			System.out.println("Strings are NOT permutations of each other!");
		}
	}

	public static Boolean isPermutation(String a_str1, String a_str2) {
		
		// Check lengths
		if (a_str1.length() != a_str2.length()) {
			return false;
		}
		
		// Use a hashmap to count occurrences of characters in string 1
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for (int i = 0; i < a_str1.length(); i++ ) {
			
			Character c = a_str1.charAt(i);
			
			// No occurrence yet, assign 0
			if (charCount.get(c) == null) {
				charCount.put(c, 0);
			}
			
			// Increment count
			charCount.put(c, charCount.get(c) + 1);
		}
		
		// Compare hashmap's content to str2
		for (int i = 0; i < a_str2.length(); i++) {
			
			Character c = a_str2.charAt(i);
			
			// Check if char count will go negative or key doesn't exist
			if (charCount.get(c) == null || charCount.get(c) == 0) {
				return false;
			}
			
			// Decrement count
			charCount.put(c, charCount.get(c) - 1);
		}
		
		return true;
	}
}
