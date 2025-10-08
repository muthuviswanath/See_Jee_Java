import java.util.Scanner;

public class ExcepHandle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int [] arr = {1,2,3};
		try {
		System.out.println(a/b);
		System.out.println(arr[1]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			try {
				b = s.nextInt();
				System.out.println(a/b);
				System.exit(0);
			}
			catch(ArithmeticException mosquito) {
				System.out.println(mosquito.getMessage());
			}
		}
		finally {
			System.out.println("Gets executed irrespective of exception occurance");
		}
		System.out.println("Will I be displayed?");
	}
}

