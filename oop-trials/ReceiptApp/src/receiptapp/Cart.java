/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptapp;

import java.util.ArrayList;

/**
 *
 * @author monishav
 */
public class Cart {
    private ArrayList<Item> cartItems = new ArrayList<>();
    public Cart() {
        System.out.println("Initializing Cart...");
    }
    
    public void addToCart(Item item) {
        cartItems.add(item);
    }
    
    public ArrayList<Item> getItems() {
        return cartItems;
    }
}
