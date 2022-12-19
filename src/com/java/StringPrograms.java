package com.java;

/**
 * @author David
 *
 */
public class StringPrograms {

	public static void main(String[] args) {

		System.out.println(checkIfPalindrome(""));
	}

	// reverse a string in Java
	private static void reverseString(String s) {

//		iteration
		String newStr = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			newStr = newStr + s.charAt(i);
		}
		System.out.println("new String : " + newStr);

		// Using toCharArray
		newStr = "";
		char[] charArray = s.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			newStr = newStr + charArray[i];
		}
		System.out.println("new String : " + newStr);

		// StringBuilder
		StringBuilder strbuilder = new StringBuilder();
		strbuilder.append(s);
		System.out.println("new string : " + strbuilder.reverse());

		// StringBuffer
		StringBuffer strBuffer = new StringBuffer(s);
		System.out.println("new string : " + strBuffer.reverse());

	}

	// check if a vowel is present in a string
	private static void checkForVowels(String s) {

		int count = 0;
		// iterative
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}

		System.out.println("number of occurences of vowels: " + count);
	}

	private static void checkForVowelsRecursive(String s) {

	}

	// check whether a string is a palindrome
	private static boolean checkIfPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < n/2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) 
				return false;
		}
		return true;
	}

	// How do you remove spaces from a string
	private static void removeSpaces(String s) {
		// TODO Auto-generated method stub

	}

	// remove leading and trailing spaces from a string
	private static void removeLeadingAndTrailingSpaces(String s) {
		// TODO Auto-generated method stub

	}

	// remove all occurrences of a given character from an input string
	private static void removeAllOccurencesOfACharacter(String s) {

	}

	// How do you get distinct characters and their count in a string
	private static void getDistinctCharactersAndTheirCount(String s) {

	}

	// Can you prove that a String object in Java is immutable programmatically
	private static void stringImmutability() {
		// TODO Auto-generated method stub

	}

	// print all permutations of string
	private static void allPermutationsOfString(String s) {
		// TODO Auto-generated method stub

	}

	// Write a program to calculate the total number of characters in the String
	private static void totalNumberOfCharacters(String s) {
		// TODO Auto-generated method stub

	}

	// How to convert an Array to String in Java
	private static void convertArrayToString(int[] arr) {
		// TODO Auto-generated method stub

	}

	// In what way should two strings be compared to determine whether they are
	// anagrams
	private static void checkIfTwoStringsAreAnagrams(String s1, String s2) {
		// TODO Auto-generated method stub

	}

	// How can we remove a specific character from a String
	private static void removeACharacterFromAString(String s) {
		// TODO Auto-generated method stub

	}

	// Write a Java program to find the duplicate words and their number of
	// occurrences in a string
	private static void findDuplicateWordsAndOccurences(String s) {
		// TODO Auto-generated method stub

	}

	// Write a Java program to count the number of words in a string
	private static void countNumberOfWords(String s) {
		// TODO Auto-generated method stub

	}

	// Write a Java program to count the total number of occurrences of a given
	// character in a string without using any loop
	private static void numberOfOccurencesOfACharacter(String s) {
		// TODO Auto-generated method stub

	}

	// Write a Java program to find duplicate characters in a string
	private static void findDuplicateCharacters(String s) {
		// TODO Auto-generated method stub

	}

	// Write a Java program to check whether one string is a rotation of another
	private static void checkIfOneStringIsRotationOfAnother(String s1, String s2) {
		// TODO Auto-generated method stub

	}

	// Write a Java program to reverse a given string with preserving the position
	// of spaces
	private static void reverseStringWhilePreservingSpaces(String s) {
		// TODO Auto-generated method stub

	}

	// How do you convert string to integer and integer to string in Java
	private static void convertStringToInteger(String s) {
		// TODO Auto-generated method stub

	}

	private static void convertIntegerToString(int num) {
		// TODO Auto-generated method stub

	}

	// How do you find longest substring without repeating characters in the given
	// string
	private static void findLongestSubstringWithoutRepeatingCharacters(String s) {
		// TODO Auto-generated method stub

	}

	// How do you swap two string variables without using third or temp variable
	private static void swapTwoStringsWithoutUsingTemp(String s1, String s2) {
		// TODO Auto-generated method stub

	}

	// How do you find first repeated and non-repeated character in the given string
	private static void findFirstRepeatedAndNonRepeatedCharacter(String s) {
		// TODO Auto-generated method stub

	}

	// How to reverse a sentence word by word
	private static void reverseSentence(String s) {
		// TODO Auto-generated method stub

	}

	// How to remove all vowels from a string
	private static void removeVowels(String s) {
		// TODO Auto-generated method stub

	}

	// Java program to print all sub strings of a string
	private static void printAllSubstrings(String s) {
		// TODO Auto-generated method stub

	}

	// Java program to print common characters between two strings in alphabetical
	// order
	private static void printCommonCharactersBetweenTwoStrings(String s1, String s2) {
		// TODO Auto-generated method stub

	}

	// Most repetitive character in a string
	private static void mostRepititiveCharacter(String s) {
		// TODO Auto-generated method stub

	}

	// How to remove characters from the first String which are present in the
	// second String
	private static void removeCharactersFromFirstStringThatArePresentInSecond(String s1, String s2) {
		// TODO Auto-generated method stub

	}

	// How do you convert a Roman numeral String to Integer
	private static void convertRomanNumeralToInteger(String s) {
		// TODO Auto-generated method stub

	}

	// How to convert Integer to Roman String
	private static void convertIntegerToRomanNumeral(int num) {
		// TODO Auto-generated method stub

	}

	// How do you check if a given string contains valid parentheses
	private static void checkForValidParantheses(String s) {
		// TODO Auto-generated method stub

	}

	// How do you find the longest palindromic substring of a given substring
	private static void findLongestPalindromicSubstring(String s) {
		// TODO Auto-generated method stub

	}

	// TextFilePrograms
	// Write a Java program to append a given string to a text file
	// How do you find the number of characters, words and lines in the given text
	// file

	// How do you find the most repeated word in a text file
	// How to sort a text file
	// How can you find a string in a text file
	// How to replace a specific string in a text file

}
