package stringmanipulations;

import java.util.Scanner;

public class PracticeProblem2 {
/*
 * Sample Input:
4
The fox is going into the jungle.
The lion is the king.
Fox has jumped over the wall.
Fox has two friends Gary the fox and Matt the turtle
Enter the word to be searched: fox

Sample Output:
4

countOccurrence(String[] arr): returns the number of occurrences
 * */
	
	public static int countOccurrence(String[] arr, String word) {
		int count = 0;
		for(String sentences: arr) {
			String[] words = sentences.split("[\\s.,]+");
			for(String w : words) {
				if(w.equalsIgnoreCase(word)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] sentences =  new String[n];
		scan.nextLine();
		for(int i=0; i<sentences.length;i++) {
			sentences[i] = scan.nextLine();
		}
		System.out.print("Enter the word to be searched: ");
		String search_word = scan.next();
		
		int count = countOccurrence(sentences, search_word);
		System.out.println(count);
	}
}
