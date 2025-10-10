package exceptionhandling;

import java.util.Scanner;

public class ExceptionScenario2 {
	public static double sumOfReciprocal(String [] numbers) throws Exception{
		double sum = 0.0;
		try {
			for (String s : numbers) {
				if(s == null || s.trim().isEmpty()) continue;
				int val = Integer.parseInt(s.trim());
				if (val == 0) continue;
				sum += 1.0 / (val * (double)val);
			}
		}
		catch (Exception e) {
			throw new Exception("Invalid Try");
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String [] nums = new String[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.next();
		}
		try {
		System.out.println(String.format("%.4f",sumOfReciprocal(nums)));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
