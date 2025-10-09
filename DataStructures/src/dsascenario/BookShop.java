package dsascenario;

import java.util.HashMap;
import java.util.Map;

public class BookShop {
	private Map<String, Integer> inventory =new HashMap<String, Integer>();
	private Map<String, Double> prices = new HashMap<String, Double>();
	private static final int MAX_TITLES = 1000;

	public void addBook(Book book, int quantity) throws BookShopException{

		if(book == null) throw new BookShopException("Book cannot be null");
		if(quantity <= 0) throw new BookShopException("Quantity must be a positive Integer");
		if(book.getPrice() <= 0) throw new BookShopException("Price must be a positive Integer");

		String name = book.getName();
		boolean isNewTitle = !inventory.containsKey(name);

		if(isNewTitle && inventory.size() >= MAX_TITLES) {
			throw new BookShopException("Cannot add more books as it exceeded the quantity " + MAX_TITLES);
		}

		if(!prices.containsKey(name)) {
			prices.put(name, book.getPrice());
		}
		else {
			//to update if the record is already present
			prices.put(name, book.getPrice());
		}

		int current_count = inventory.containsKey(name)?inventory.get(name):0;
		inventory.put(name, current_count + quantity) ;
	}

	public double buyBook(String bookName, int quantity, double moneyPaid) throws BookShopException{
		if(bookName == null  || bookName.trim().isEmpty()) throw new BookShopException("Book name cannot be null or Empty");
		if(quantity <= 0) throw new BookShopException("Quantity must be a positive integer");
		if(!inventory.containsKey(bookName)) throw new BookNotFoundException("Requested book: " + bookName + " is not found");
		int available = inventory.get(bookName);
		if(quantity > available) {
			throw new InsufficientStockException("The requested quantity exceeds the available stock");
		}
		double unitprice = prices.get(bookName);
		double totalprice = unitprice * quantity;
		if(moneyPaid < totalprice) {
			throw new InsufficientFundsException("The amount paid is insufficient");
		}
		inventory.put(bookName, available-quantity);
		return moneyPaid - totalprice;
	}
	
	
}
