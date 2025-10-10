package exceptionhandling;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
	public static String findSecondLargest(List<Integer> list){
		if(list.size() < 2) {
			return "Error: List has fewer than two elements";
		}
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int num:list) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			}
			else if(num > secondlargest && num != largest) {
				secondlargest = num;
			}
		} 
		if(secondlargest == Integer.MIN_VALUE) {
			return "Error: No second largest number found";
		}
		return String.valueOf(secondlargest);
	}
	public static void main(String[] args) {
		System.out.println(findSecondLargest(Arrays.asList(10, 20, 30, 40, 50)));
		System.out.println(findSecondLargest(Arrays.asList(10)));
		System.out.println(findSecondLargest(Arrays.asList(10, 10,10,10,10)));
	}
}
