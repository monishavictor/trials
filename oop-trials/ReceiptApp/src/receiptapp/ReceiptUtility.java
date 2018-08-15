/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptapp;

import Inventory.Inventory;
import Inventory.ProductFactory;
import Inventory.Product;

/**
 *
 * @author monishav
 */
public class ReceiptUtility {
    public static void addToInventory() {
        ProductFactory fact = new ProductFactory();
        Inventory inventory = Inventory.getInstance();
        // name, quantity, unit, rate
        Product prod = fact.getProduct("Book", "book", 10, null, 10);
        inventory.addToInventory("Book", prod);

        prod = fact.getProduct("Medicine", "headache pills", 10, "box", 10);
        inventory.addToInventory("Medicine", prod);

        prod = fact.getProduct("Food", "chocolates", 10, null, 10);
        inventory.addToInventory("Food", prod);

        prod = fact.getProduct("Beverage", "wine", 10, "bottle", 10);
        inventory.addToInventory("Beverage", prod);

        prod = fact.getProduct("Stationery", "pens", 1, "box", 10);
        inventory.addToInventory("Stationery", prod);
       
        inventory.listProducts();
    }
    
    public static Cart getCart() {
        
        Cart cart = new Cart();
        cart.addToCart(new Item("Book", null, 10));
        cart.addToCart(new Item("Medicine", "box", 10));
        cart.addToCart(new Item("Food", "null", 10));
        cart.addToCart(new Item("Beverage", "bottle", 4));
        cart.addToCart(new Item("Stationery", "box", 10));
        
        return cart;
    }
    
    public static void listProducts() {
        Inventory.getInstance().listProducts();
    }
}
