/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author monishav
 */
import java.util.Map;
import java.util.HashMap;

public class Cart {
	/**/
	
	private Map<Product, Integer> items;
	private Inventory inv = Inventory.getInstance();
	
	public Cart() {
		items = new HashMap<Product, Integer>();
	}
	
	public void addItem(Product product, Integer amount) {
		this.items.put(product, amount);
	}
	
	public void removeItem(Product product) {
		this.items.remove(product);
	}
	
	public void generateInvoice() {
	    Double totalPrice = 0.0;
		for (Map.Entry<Product, Integer> item : items.entrySet()) {
		  Integer quantity = item.getValue();
		  Double itemPrice = quantity * item.getKey().getPrice();
		  System.out.println(item.getKey().getName() + " " + quantity + " " + itemPrice);
		  totalPrice += itemPrice;
		}
		System.out.println("Total Price: " + totalPrice);
	}
	
	public void checkOut() {
		for (Map.Entry<Product, Integer> item : items.entrySet()) {
		  Integer quantity = this.items.get(item);
		  Map<Product, Integer> rem = new HashMap<Product, Integer>();
		  rem.put(item.getKey(), quantity);
		  inv.removeItems(rem);
		}		
		
	}
	public void emptyCart() {
		this.items = new HashMap<Product, Integer>();
	}
	
}
