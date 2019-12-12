package com.injectingObjectType;

public class Manager {

  private int id;
  private Employee work;    //now reference "work" contain null value we inject value for it in xml configuration file

    public void setWork(Employee work) {
        this.work = work;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void task()
    {
       work.working();
       System.out.println("Employee id is" + id);
    }
}
