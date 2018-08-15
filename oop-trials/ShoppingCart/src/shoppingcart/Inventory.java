/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author monishav
 */


public class Inventory {

	/**/
	private static Inventory instance;
	
	private Map<Product, Integer> products;
	
	private Inventory() {
		products = new HashMap<Product, Integer>();
	}
	
	public static Inventory getInstance() {
		if (instance == null) {
		    instance = new Inventory();
		}
		return instance;
	}
	
	public void addItems(Map<Product, Integer> items) {
	    for (Map.Entry<Product, Integer> item : items.entrySet()) {
	        Product temp = item.getKey();
	        
	      if(this.products.containsKey(temp)) {
	          Integer tempVal = this.products.get(temp);
	          this.products.put(temp, tempVal + item.getValue());
	      }
	      else {
	        this.products.put(item.getKey(), item.getValue());    
	      }
		  
		}
	}
	
	public void removeItems(Map<Product, Integer> items) {
		for (Map.Entry<Product, Integer> item : items.entrySet()) {
		  Integer existingVal = this.products.get(item.getKey());
		  this.products.put(item.getKey(), existingVal - item.getValue());
		}
	}
	
	public Integer getAvailableAmount(Product product) {
	    return this.products.get(product);
	}
	
	
	
}

