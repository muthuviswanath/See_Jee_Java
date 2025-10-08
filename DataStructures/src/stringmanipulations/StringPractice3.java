package stringmanipulations;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice3 {
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return (c =='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
	
	public static boolean alternativeVowels(String str) {
		if(str.isEmpty()||!isVowel(str.charAt(0))) {
			return false;
		}
		for(int i=0; i<str.length();i++) {
			if(i%2 == 0 && !isVowel(str.charAt(i))) return false;
			if(i%2 != 0 && isVowel(str.charAt(i))) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		ArrayList<String> validStrings = new ArrayList<String>();
		for(int i=0; i<n;i++ ) {
			String str = scan.nextLine();
			if(alternativeVowels(str)) {
				validStrings.add(str);
			}
		}
		
		for (String string : validStrings) {
			System.out.println(string);
		}
	}
}
