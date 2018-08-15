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
public class EmployeeFactory {
    public final static String EMPLOYEE = "Employee";
    public final static String RESPONDENT = "Respondent";
    public final static String MANAGER = "Manager";
    public final static String DIRECTOR = "Director";


    public Employee getEmployee(String type, String name) {
        switch(type) {
            case RESPONDENT:
                return new Respondent(name);
            case MANAGER:
                return new Manager(name);
            case DIRECTOR:
                return new Director(name);
        }
        return null;
    }
}
