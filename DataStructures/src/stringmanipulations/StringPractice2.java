package stringmanipulations;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice2 {
/*
 * - The first character should be a lowercase alphabet
- The second character should be a number
- The third character should be a uppercase alphabet
- The fourth character should be a number
- The fifth character should be a lowercase alphabet
 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> pattern_list = new ArrayList<String>();
		for(int i=0; i<n; i++) {
			String pattern = scan.next();
			if(pattern.length() == 5 &&
					Character.isLowerCase(pattern.charAt(0)) &&
					Character.isDigit(pattern.charAt(1)) &&
					Character.isUpperCase(pattern.charAt(2)) &&
					Character.isDigit(pattern.charAt(3)) &&
					Character.isLowerCase(pattern.charAt(4))
					) {
				pattern_list.add(pattern);
			}
		}
		for(String pat : pattern_list) {
			System.out.println(pat);
		}
	}
}
