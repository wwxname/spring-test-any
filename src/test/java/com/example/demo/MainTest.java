package com.example.demo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
@EnableAsync()
@Configuration
public class MainTest {
    public static void main(String args[]) {

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Boot.class);
        A a = (A) configApplicationContext.getBean("a");
        a.test();


    }
}

@EnableA
class Boot {

}

@Import(DemoConfig.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface EnableA {

}

@Configuration
@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
class DemoConfig {
    @Bean(name = "a")
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public A getA() {
        return new A();
    }

}

class A {
    public void test() {
        System.err.println("-----");
    }
}