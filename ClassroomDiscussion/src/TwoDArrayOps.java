import java.util.Scanner;

public class TwoDArrayOps {
	/*
	 * 1. Find the sum of the elements in each row
	 * 2. Find the sum of the elements in each column
	 * 3. Find the sum of the primary diagonal and print the diagonal values
	 * 4. Find the sum of the secondary diagonal and print the diagonal values
	 * 5. Transpose the given array (rows as columns and columns as rows)
	 * 6. Traverse the array in spiral format
	 */
	static int[][] arr = new int[5][5];
	static Scanner sc = new Scanner(System.in);

	static int[][] createArray() {
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[][] = null;
		do {
			System.out.println("1. Create a 2D array");
			System.out.println("2. Find the sum of the elements in each row");
			System.out.println("3. Find the sum of the elements in each column");
			System.out.println("4. Find the sum of the primary diagonal and print the diagonal values");
			System.out.println("5. Find the sum of the secondary diagonal and print the diagonal values");
			System.out.println("6. Transpose the given array (rows as columns and columns as rows)");
			System.out.println("7. Traverse the array in spiral format");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				arr =  createArray();
				System.out.println("The array is: ");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Sum of each row: ");
				for (int i = 0; i < arr.length; i++) {
					int sum = 0;
					for (int j = 0; j < arr[i].length; j++) {
						sum += arr[i][j];
					}
					System.out.println("Row " + (i + 1) + ": " + sum);
				}
				break;
			case 3:
				System.out.println("Sum of each column: ");
				for (int j = 0; j < arr[0].length; j++) {
					int sum = 0;
					for (int i = 0; i < arr.length; i++) {
						sum += arr[i][j];
					}
					System.out.println("Column " + (j + 1) + ": " + sum);
				}
				break;
			case 4:
				System.out.println("Primary diagonal elements: ");
				int primarySum = 0;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][i] + " ");
					primarySum += arr[i][i];
				}
				System.out.println("\nSum of primary diagonal: " + primarySum);
				break;
			case 5:
				System.out.println("Secondary diagonal elements: ");
				int secondarySum = 0;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][arr.length - 1 - i] + " ");
					secondarySum += arr[i][arr.length - 1 - i];
				}
				System.out.println("\nSum of secondary diagonal: " + secondarySum);
				break;
			case 6:
				System.out.println("Transposed array: ");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[j][i] + " ");
					}
					System.out.println();
				}
				break;	
			case 7:
			}
		} while (true);
	}
}
