/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callcenter;

import callcenter.employee.EmployeeFactory;
import callcenter.employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author monishav
 */
public class CallCenterHandler {
    private static CallCenterHandler instance;
    private int callCount = 1;
    ArrayList<Employee> respondents = new ArrayList<Employee>() {};

    private CallCenterHandler() {
        System.out.println("Initializing Call Center Handler");
        EmployeeFactory empFact = new EmployeeFactory();
        Employee r1 = empFact.getEmployee(EmployeeFactory.RESPONDENT, "r1");
        Employee r2 = empFact.getEmployee(EmployeeFactory.RESPONDENT, "r2");
        Employee r3 = empFact.getEmployee(EmployeeFactory.RESPONDENT, "r3");
        
        Employee m1 = empFact.getEmployee(EmployeeFactory.MANAGER, "m1");
        Employee m2 = empFact.getEmployee(EmployeeFactory.MANAGER, "m2");
            
        Employee dir = empFact.getEmployee(EmployeeFactory.DIRECTOR, "dir");
            
        r1.setSuperior(m1);
        r2.setSuperior(m2);
        r3.setSuperior(m1);
            
        m1.setSuperior(dir);
        m2.setSuperior(dir);

        respondents.add(r1);
        respondents.add(r2);
        respondents.add(r3);
    }
    
    static CallCenterHandler getInstance() {
        if (instance == null) {
            instance = new CallCenterHandler();
        }
        return instance;
    }
    
    public void dispatchCall() {
        System.out.println("Received call::" + callCount);
        respondents.get(callCount % 3).dispatchCall();
        callCount++;
    }

}
