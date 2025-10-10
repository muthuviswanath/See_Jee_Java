package dsascenario;

import java.util.Scanner;

public class StackOrder {
	public static int equalStacks(int[] h1, int[] h2, int[] h3){
		int i1 = 0 , i2 =0, i3 = 0;//i1 = 1 2
		int s1 = 0, s2 = 0, s3 = 0;//15, 6, 6
		
		for (int values : h1) s1 += values; //15 15 - h1[0] = 10 - h1[1] = 6
		for (int values : h2) s2 += values; //6
		for (int values : h3) s3 += values; //6
		
		//len(h1) = 5; len(h2) = 3; len(h3) = 3
		while(true) {
			if (s1 == s2 && s2 == s3) return s1;
			
			if (i1 == h1.length || i2 == h2.length || i3 == h3.length) return 0;
			
			if(s1 >= s2 && s1 >= s3) {
				s1 -= h1[i1++];
			}
			else if(s2 >= s1 && s2 >= s3) {
				s2 -= h2[i2++];
			}
			else {
				s3 -= h3[i3++];
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int[] h1 = new int [n1];
		int[] h2 = new int [n2];
		int[] h3 = new int [n3];
		
		for(int i=0; i<n1;i++) h1[i] = sc.nextInt();
		for(int i=0; i<n2;i++) h2[i] = sc.nextInt();
		for(int i=0; i<n3;i++) h3[i] = sc.nextInt();
		
		System.out.println(equalStacks(h1,h2,h3));
	}
}
