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
public class Respondent extends Employee {
    public Respondent(String name) {
        super(name, 3);
    }

    @Override
    public void dispatchCall() {
        if(this.count == this.limit) {
            System.out.println(this.getName() + " cannot handle the call");
            getSuperior().dispatchCall();
            this.count = 0;
        }
        else {
            this.count++;
            handleCall();
        }
    }
}
