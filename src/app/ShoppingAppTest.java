package app;

import java.util.Scanner;

/**
 * Author: Livia Smith
 *
 * The main class populates a product list and creates an empty shopping cart. The product list is printed 
 * to the console through a while loop. A scanner object is created to accept input from the user. The 
 * customer can choose to: add product to cart, purchase a product, cancel order/empty cart, checkout. 
 * 
 * When a product is put into the cart, the product's quantity is reduced. When a product is emptied from
 * the cart, the product's quantity is increased.
 * 
 * When the customer is ready to checkout, the amount owed is printed to screen.
 */

public class ShoppingAppTest {

	public static void main(String[] args) {		
		//Create Product array to hold inventory list
		Product[] arr;
		arr = new Product[4];
		
		//Create Empty Shopping Cart
		ShoppingCart[] item;
		item = new ShoppingCart[4];
		
		//Populate array with products 
		arr[0] = new Product(1, "Fishing Lures", "Rooster Tale", 6.99, 4);
		arr[1] = new Product(2, "Ammunition", "9mm", 48.99, 3);
		arr[2] = new Product(3, "Hiking Boots", "Size 8", 37.50, 1);
		arr[3] = new Product(4, "Tent", "6-Person", 200.00, 1);		
		
		//While loop to print out inventory list
		System.out.println("Welcome to The Outdoorsman. Check out what's in stock:");
		int i;
		i = 0;
		while(i < arr.length) 
			{
			System.out.println(); 
			System.out.println("ID: " + arr[i].getId());
			System.out.println("Product Name: " + arr[i].getName());
			System.out.println("Description: " + arr[i].getDescription());
			System.out.println("Price: " + arr[i].getPrice());
			System.out.println("Qty in Stock: " + arr[i].getQty());
			 i++;                               
			} 
		
		
		// creating the instance of class Scanner to obtain user input
        Scanner obj = new Scanner(System.in);
        String choice;
        
        //Ask customer if they want to add item to cart
        System.out.println("");
        System.out.println("Would you like to add item to cart? Enter 'Y' for Yes; 'N' for No: ");
        choice = obj.nextLine();

   
        //Customer chooses item to add to cart
        if (choice.equals("Y")) {
        	System.out.println("");
        	System.out.println("Enter the ID Number of the item you would like to add: ");
        	int prodChoice = obj.nextInt() - 1;
        	
        	//add item to shopping cart
        	item[prodChoice] = new ShoppingCart(arr[prodChoice].getId(), arr[prodChoice].getName(), arr[prodChoice].getDescription(), arr[prodChoice].getPrice(), arr[prodChoice].getQty());
        	System.out.println("");
        	System.out.println("This item has been added to you cart: " + arr[prodChoice].getName());
    	
    		//Reduce in stock quantity
    		int newQuantity = arr[prodChoice].getQty() - 1;
    		arr[prodChoice].setQty(newQuantity);
    		
    		//Check out
    		System.out.println("");
    		System.out.println("Would you like to check out? Enter 'Y' for Yes; 'N' for No: ");
            System.out.println(obj.nextLine());
    		choice = obj.nextLine();
            
    		//Provide cost at checkout
            if (choice.equals("Y")) {
            	System.out.println("Your cost is " + item[prodChoice].getPrice());
            }
            //Allow customer to keep shopping or to cancel their order. If shopping continues, a new list (with updated quantities) is printed.
            else if (choice.equals("N")) {
            	System.out.println("If you would like to add more items, press A. To cancel order, press C: ");
                choice = obj.nextLine();
            	if (choice.equals("A")) {
            		i = 0;
            		while(i < arr.length) 
            			{
            			System.out.println(); 
            			System.out.println("ID: " + arr[i].getId());
            			System.out.println("Product Name: " + arr[i].getName());
            			System.out.println("Description: " + arr[i].getDescription());
            			System.out.println("Price: " + arr[i].getPrice());
            			System.out.println("Qty in Stock: " + arr[i].getQty());
            			 i++;                               
            			} 
            	}
            	//Cancel order, remove from shopping cart, add quantity back to product list.
            	else if (choice.equals("C")) {
            		int quantity = arr[prodChoice].getQty() + 1;
            		arr[prodChoice].setQty(quantity);  
            		item[prodChoice].emptyCart();
            	}
            		
            	
            }
        }
        
       //Thank the customer for checking out the inventory list at the end of the shopping experience.
        else if (choice.equals("N")) {
            System.out.println("Thanks for checking out our inventory list! Come back soon!");
        
        }
      
        //Close scanner
        obj.close();
        
	}
}


