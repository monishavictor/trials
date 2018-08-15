/*

Imagine you have a call center with three levels of employees: respondent,
manager and director. An incoming telephone call must be first allocated to a
respondent who is free. If the respondent can't handle the call, he or she must
escalate the call to a manager. If the manager is not free or not able to handle it,
then the call should be escalated to a director. Design the classes and data
structures for this problem. Implement a method dispatchCaLL() which assigns a
call to the first available employee.

*/

package callcenter;

/**
 *
 * @author monishav
 */

public class CallCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Call Center Application");
        CallCenterHandler callCenter = CallCenterHandler.getInstance();
        int i = 0;
        while(i < 30) {
            callCenter.dispatchCall();
            i++;
        }   
    }
    
}