package app;

/* Creates an instance of a product detailing what it is, its price and how many are in stock. Methods
 * reduce a product's quantity when user adds to cart, as well as returns a product when user empty's cart.*/

public class Product {
	//Declare variables
	private int id;
	private String name;
	private String description;
	private double price;
	private int qty;
	
	//Construct product list item.
	public Product(int id, String name, String description, double d, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = d;
		this.qty = qty;
	}
	
	//Method sets new product quantity when user adds item to cart.
	public void reduceQuantity(int newQuantity) {
		setQty(newQuantity);
	}

	//Method adds quantity back to stock if user clears cart.
	public void addQuantity(int quantity) {
		quantity = quantity + 1;
	}
	
	//Setter and getter statements.
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
