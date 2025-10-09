package dsascenario;

public class Book {
	private String name;
	private String category;
	private int pages;
	private double price;
	public Book(String name, String category, int pages, double price) {
		if(name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Book name is required");
		if(price <=0) throw new IllegalArgumentException("Price must be a positive integer");
		if(pages <=0) throw new IllegalArgumentException("Pages must be a positive integer");

		this.name = name;
		this.category = (category == null)?"":category.trim();
		this.pages = pages;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public int getPages() {
		return pages;
	}
	public double getPrice() {
		return price;
	}

	

}
