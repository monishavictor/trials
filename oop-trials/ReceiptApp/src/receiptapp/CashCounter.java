/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptapp;

import Inventory.Inventory;
import Inventory.Product;

/**
 *
 * @author monishav
 */
public class CashCounter {
    public CashCounter() {
        System.out.println("New Receipt\n");
    }
    public void printReceipt(Cart cart) {
        Inventory inventory = Inventory.getInstance();
        float taxTotal = 0, billTotal = 0;
        String warningMsg = "";
        for(Item item: cart.getItems()) {
            String type = item.getType();
            Product prod = inventory.getProduct(type);
            int quantity = item.getQuantity();
            if (prod.getQuantity() < item.getQuantity()) {
                warningMsg += "Billing " + item.getType() + " for " + prod.getQuantity() + " units\n";
                quantity = prod.getQuantity();
            }
            String prodUnit = prod.getUnit();
            String itemUnit = item.getUnit();
            boolean isValid = false;
            if (prodUnit == null && itemUnit == null) {
                isValid = true;
            }
            else if (prodUnit == null || itemUnit == null) {
                isValid = false;
            }
            else if(prodUnit.equals(itemUnit)) {
                isValid = true;
            }
            if (!isValid) {
                warningMsg += item.getType() + " not sold in " + item.getUnit() + "\n";
                continue;
            }
            
            float curBill = quantity * prod.getRate();
            float curTax = (float) ((prod.getTax() * curBill)/100);

            prod.setQuantity(prod.getQuantity() - quantity);
            taxTotal += curTax;
            billTotal += curBill;
            
            System.out.println(quantity + " " + prod.getName() + ":" + (curTax + curBill));
        }
        System.out.println("\nSales Tax " + taxTotal);
        System.out.println("\nTotal " + (billTotal + taxTotal));
        System.out.println("\n" + warningMsg);
    }
}
