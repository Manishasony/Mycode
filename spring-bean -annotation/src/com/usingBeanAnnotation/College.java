


package com.usingBeanAnnotation;

import org.springframework.stereotype.Component;

public class College {
    private Principal principal;

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test()
    {
        principal.principalInfo();
        System.out.println("successfully configured");
    }

}
