/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptapp;

/**
 *
 * @author monishav
 */
public class Item {
    private String type;
    private String unit;
    private int quantity;
    public Item(String type, String unit, int quantity) {
        this.type = type;
        this.unit = unit;
        this.quantity = quantity;
    }
    
    String getType() {
        return type;
    }
    
    String getUnit() {
        return unit;
    }
    
    int getQuantity() {
        return quantity;
    }
}