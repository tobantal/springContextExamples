package com.javarticles.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestWithNoContextConfigurationOrContextHierarchy {

    @Autowired
    private A beanA;
    
    @Test
    public void verifyBeanAConfigured() {
        assertNotNull(beanA);
    }
    
    @Configuration
    static class Config {
        @Bean
        A beanA() {
            return new A();
        }
    }
}
