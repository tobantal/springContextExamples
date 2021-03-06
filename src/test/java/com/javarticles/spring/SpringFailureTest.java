package com.javarticles.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringFailureTest {

    @Autowired
    private A beanA;
    
    @Autowired
    private Config config;
    
    @Test
    public void verifyBeansConfigured() {
        assertNotNull(beanA);
        assertNotNull(config);
    }
    
    @Configuration
    static class Config {
        
    }
}
