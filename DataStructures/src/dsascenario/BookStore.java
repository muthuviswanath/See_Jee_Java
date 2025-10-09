package dsascenario;

import java.util.Scanner;

public class BookStore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookShop shop = new BookShop();
		try {
		shop.addBook(new Book("Java Programming", "Programming", 450, 25.00), 6);
		shop.addBook(new Book("Mystery Novel", "Fiction", 120, 20.00), 2);
		}
		catch(BookShopException b) {
			System.out.println("Issues in adding: " + b.getMessage());
		}
		
		System.out.println("Enter the values as: Book Name, quantity, Money Paid");
		System.out.println("Type exit to quit");
		
		while(true) {
			System.out.println("-----------------------------");
			String line = sc.nextLine();
			if(line == null) break;
			line = line.trim();
			if(line.equalsIgnoreCase("exit")) {
				System.out.println("Thanks for visiting the book shop");
				break;
			}
			if(line.isEmpty()) continue;
			String[] order_format = line.split(",",3);
			if(order_format.length < 3) {
				System.out.println("Invalid format of ordering the book \n"
						+ "Give it in the format: Book Name, quantity, Money Paid");
				continue;
			}
			String bookname = order_format[0];
			String orderqty = order_format[1];
			String moneypaid = order_format[2];
			
			int qty =0;
			double paidmoney =0;
			
			try {
				qty = Integer.parseInt(orderqty);
				paidmoney = Double.parseDouble(moneypaid);
			}
			catch(NumberFormatException nfe) {
				System.out.println("Quantity and Money should be a number " + nfe.getMessage());
			}
			
			try {
			double balance = shop.buyBook(bookname, qty, paidmoney);
			System.out.println("Purchase successful! Change returned: " + balance);
			}
			catch(BookShopException b) {
				System.out.println("Purchase Failed: " + b.getMessage());
			}
			
		}
		sc.close();
	}
}
