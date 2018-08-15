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
public class Product {
    private int quantity;
    private String name;
    private String unit;
    private float rate;
    protected int tax;
    
    public Product(String name, int quantity, String unit, float rate) {
        this.quantity = quantity;
        this.name = name;
        this.unit = unit;
        this.rate = rate;
        this.tax = 20;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUnit() {
        return unit;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int getTax() {
        return tax;
    }

    public float getRate() {
        return rate;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ":" + quantity;
    } 
}
