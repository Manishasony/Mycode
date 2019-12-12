/**
 * This class also uses the same dependancies of which manager class used.
 */

package com.injectingObjectType;

public class AnotherManager {
    private Employee emp;

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void startTask()
    {
        emp.working();
    }
}
