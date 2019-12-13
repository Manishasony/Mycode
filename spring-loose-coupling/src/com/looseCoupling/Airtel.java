package com.looseCoupling;

public class Airtel {
    private Service serve;

    public void setServe(Service serve) {
        this.serve = serve;
    }
    public void activateService()
    {
        serve.service();
    }



}
