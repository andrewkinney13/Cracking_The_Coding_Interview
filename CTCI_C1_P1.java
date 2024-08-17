// Andrew Kinney
// 8.17.2024
// Cracking the Coding Interview
// Chapter 1: Arrays and Strings
// Problem 1.1: determine if a string has no duplicate elements

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class CTCI_C1_P1 {

	public static void main(String[] args) {
		
		// Obtain the string itself
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scanner.nextLine();
		
		// Check the string
		if (containsDuplicates(s)) {
			System.out.println("That string contained duplicates :(");
		}
		else {
			System.out.println("That string didn't contain duplicates :)");
		}
		
		// Close scanner
		scanner.close();
	}
	
	public static Boolean containsDuplicates(String a_s) {
		
		// Create a set of characters we've checked
		Set<Character> chars = new HashSet<>();
		
		// Add all the chars within the string
		for (Character ch : a_s.toCharArray()) chars.add(ch);
		
		// Compare length
		return a_s.length() != chars.size();
	}
}