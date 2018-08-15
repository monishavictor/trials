package receiptApp;

import org.junit.Test;

import receiptapp.ReceiptUtility;
import receiptapp.Cart;
import receiptapp.CashCounter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monishav
 */
public class receiptTest {
    @Test
    public void testReceiptApp() {
        ReceiptUtility.addToInventory();
        Cart cart = receiptapp.ReceiptUtility.getCart();
        new CashCounter().printReceipt(cart);
        ReceiptUtility.listProducts();        
    }    
}
