package exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExceptionScenario1 {
	static List<String> numberSegregator(String s) throws Exception{
		List<String> numbers = new ArrayList<String>();
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		while(m.find()) {
			numbers.add(m.group());
			
		}
		
		if (numbers.isEmpty()) throw new Exception ("Invalid Input");
		return numbers;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
		System.out.println(numberSegregator(s));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
