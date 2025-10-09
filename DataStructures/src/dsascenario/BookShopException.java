package dsascenario;

public class BookShopException extends Exception{
	public BookShopException(String message) {
		super(message);
	}
}

class BookNotFoundException extends BookShopException{
	public BookNotFoundException(String message) {
		super(message);
	}
}

class InsufficientStockException extends BookShopException{
	public InsufficientStockException(String message) {
		super(message);
	}
}

class InsufficientFundsException extends BookShopException{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
