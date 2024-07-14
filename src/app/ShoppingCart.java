package app;

/*Creates a shopping cart that holds items added by user. */

public class ShoppingCart {
	//variable declaration
	private int id;
	private String name;
	private String description;
	private double price;
	private int qty;
	
	//construct ShoppingCart item.
	public ShoppingCart(int id, String name, String description, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.qty = qty;
	}
	
	//Prints message to console, confirming item added to cart.
	public void addItem() {
		System.out.println("The following item has been added to your cart: " + this.name);
	}
	
	//Prints message to console, confirming cart is empty.
	public void emptyCart() {
		System.out.println("Your cart is empty.");
	}
	
	//setter and getter statements 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
