package stringmanipulations;

import java.util.Scanner;

/*
 * Question 1: Remove Specific Character.

Sample Input 1 (Valid):

hello world
o

Output: 
hell wrld

=========================================================================================================================================================

Question 2: Capitalize First Letter of Each Word

Sample Input 1 (Valid):

hello world from java

Output: 
Hello World From Java

=========================================================================================================================================================

Question 3: String Rotation Checker. For example, "waterbottle" is a rotation of "erbottlewat".

Sample Input 1 (Valid):

waterbottle
erbottlewat

Output: 

True

=========================================================================================================================================================

Question 4: Count Words Ending with Specific Letter

Sample Input 1 (Valid):

The quick brown fox jumps
s

Output: 
1

=========================================================================================================================================================

Question 5: Replace Substring

Sample Input 1 (Valid):

banana 
na
xy

Output: 
baxyxy
 * 
 * 
 * */
public class StringPractice1 {

	static void removeSpecificCharacter(String s, char c) {
		String result = s.replace(Character.toString(c), "");
		System.out.println(result);
	}
	
	static void capitalizeFirstChar(String s) {
		String[] str = s.split(" ");
		String result ="";
		for(String st:str) {
			result += Character.toUpperCase(st.charAt(0))+ st.substring(1)+" ";
		}
		System.out.println(result.trim());
		
	}
	
	static void anagramCheck(String s1, String s2) {
		if (s1.length() == s2.length() && (s1+s1).contains(s2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	static void anagramString(String s1, String s2) {
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		if (s1.length() != s2.length()) {
			System.out.println("It is not anagram");
			return;
		}
		int count[] = new int[26];
		for(int i=0; i<s1.length(); i++ ) {
			count[s1.charAt(i) - 'A'] ++;
			count[s2.charAt(i) - 'A'] --;
		}
		
		for(int i=0; i<26; i++) {
			if (count[i]  !=0) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}
	
	static void countEndingCharacters(String s, char c) {
		int count = 0;
		String[] words = s.split("\s");
		for (String st: words) {
			if(!st.isEmpty() && st.charAt(st.length()-1) == c) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// removeSpecificCharacter("hello world", 'o');
		capitalizeFirstChar("hello world from java");
		anagramCheck("waterbottle", "erbottlewat");
		anagramString("motherinlaw", "hitlerwoman");
		anagramString("teacher", "cheater");
		countEndingCharacters("The quick s fox jumps", 's');
	}
}
