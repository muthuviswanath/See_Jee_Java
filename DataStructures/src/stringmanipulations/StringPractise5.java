package stringmanipulations;

import java.util.Scanner;

/*
 * 5. WAP in Java to check if a given string is a palindrome and count the number of 
 * palindromes in an array of strings.

The program should ignore spaces and case sensitivity while checking for palindromes.

Sample Input:
5
level
Madam
civic
World
rotor

Sample Output:
4
 * */
public class StringPractise5 {
	
	public static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();
		int left = 0;
		int right = str.length()-1;
		
		while (left < right) {
			if(str.charAt(left++) != str.charAt(right--)) {
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int count = 0;
		for(int i=0; i<n; i++) {
			String words  = sc.nextLine();
			if(isPalindrome(words)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
