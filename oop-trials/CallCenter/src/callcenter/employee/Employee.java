package callcenter.employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monishav
 */
public abstract class Employee {
    private String name;
    private Employee superior;
    protected int count;
    protected int limit;
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    public void setSuperior(Employee sup) {
        this.superior = sup;
    }
    
    Employee getSuperior() {
        return superior;
    }
    
    public Employee(String name, int limit) {
        this.count = 0;
        this.name = name;
        this.limit = limit;
    }

    abstract public void dispatchCall();
    
    void handleCall() {
        System.out.println(this.getName() + " handling call");
    }

}
