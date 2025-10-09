package stringmanipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 4. WAP in Java to find all strings in an array that contain exactly two vowels 
 * and three consonants, and return the matching strings.

Sample Input:
5
train
horse
apple
brisk
flute

Sample Output:
train
horse
apple
flute
 * */
public class StringPractice4 {
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return (c == 'a' || c== 'e' || c== 'i' || c== 'o' || c=='u');
	}

	public static boolean twoVowelsThreeConsonants(String s) {
		int vowels = 0, consonants = 0;
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(isVowel(ch)) vowels ++;
				else consonants ++;
			}
		}
		return vowels == 2 && consonants == 3;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String> output = new ArrayList<String>();
		for(int i=0; i<n; i++) {
			String words = sc.nextLine();
			if(twoVowelsThreeConsonants(words)) {
				output.add(words);		
			}
		}
		for (String string : output) {
			System.out.println(string);
		}
	}
}