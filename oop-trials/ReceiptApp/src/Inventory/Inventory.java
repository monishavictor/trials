/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import java.util.HashMap;

/**
 *
 * @author monishav
 */
public class Inventory {
    
    private static Inventory instance;
    private HashMap<String, Product> products;
    
    private Inventory() {
        System.out.println("Initializing inventory...");
        products = new HashMap<>();
    }
    
    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }
    
    public void addToInventory(String type, Product product) {
        products.put(type, product);
    }

    public Product getProduct(String type) {
        return products.get(type);
    }

    public void listProducts() {
        System.out.println("-------------------------------");
        products.entrySet().stream().forEach((pair) -> {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        });
        System.out.println("-------------------------------");
    }
}
