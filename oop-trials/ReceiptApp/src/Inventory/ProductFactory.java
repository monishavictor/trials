/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

/**
 *
 * @author monishav
 */
public class ProductFactory {
    public Product getProduct(String type, String name, int quantity, String unit, int rate) {
        Product prod = null;
        // name, quantity, unit, rate, tax
        switch(type) {
            case "Book":
                prod = new Book(name, quantity, unit, rate);
                break;
            case "Medicine":
                prod = new Medicine(name, quantity, unit, rate);
                break;
            case "Food":
                prod = new Food(name, quantity, unit, rate);
                break;
            case "Beverage":
                prod = new Beverage(name, quantity, unit, rate);
                break;
            case "Stationery":
                prod = new Stationery(name, quantity, unit, rate);
                break;
        }
        return prod;
    }
}
