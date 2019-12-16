/**
 * created by manisha
 * here i ued @Component  annotation for creating bean and
 * @configuration annotation is used for configuration
 * @ComponentScan annotation is defining our packages path
 */


package com.configuringWithoutUsingXml;

import org.springframework.stereotype.Component;

@Component("collegebean")
public class College {
    public void test()
    {
        System.out.println("successfully configured");
    }

}
