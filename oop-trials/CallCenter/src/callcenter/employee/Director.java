/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callcenter.employee;

/**
 *
 * @author monishav
 */
public class Director extends Employee {

    public Director(String name) {
        super(name, 0);
    }

    @Override
    public void dispatchCall() {
        handleCall();
    }
    
}
