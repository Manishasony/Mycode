/**
 * created by manisha
 * here @bean annotation used to create a bean,normal method to make it work like a bean.
 */


package com.usingBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Callable;

@Configuration

public class CollegeConfig {
    @Bean
    public Principal principalBean()
    {
        Principal principal=new Principal();
        return principal;
    }

    @Bean
    public College collegeBean()
    {
       College college=new College();
       college.setPrincipal(principalBean());
       return college;
    }
}
