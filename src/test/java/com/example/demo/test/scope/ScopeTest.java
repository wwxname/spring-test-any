package com.example.demo.test.scope;


import org.springframework.aop.SpringProxy;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.AopInfrastructureBean;
import org.springframework.aop.scope.ScopedObject;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class ScopeTest {

    ScopedObject scopedObject;
    AopInfrastructureBean aopInfrastructureBean;
    SpringProxy springProxy;
    Advised advised;
    Factory factory;


    public static void main(String args[]) throws InterruptedException {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext("com.example.demo.test.scope");
        SingletonBean singletonBean = (SingletonBean) configApplicationContext.getBean("singletonBean");
        System.err.println(singletonBean.getPrototype().toString());
        singletonBean.printTime();
        Thread.sleep(100);
        SingletonBean singletonBean1 = (SingletonBean) configApplicationContext.getBean("singletonBean");
        singletonBean1.printTime();
        System.err.println(singletonBean.toString()+"----"+singletonBean1.toString());
        System.err.println(singletonBean.getPrototype().toString());

        PrototypeBean p =  singletonBean.getPrototype();
        Class clazz = p.getClass();
        Class[] is = clazz.getInterfaces();
        Method[] ms = clazz.getMethods();
        Thread.sleep(2000);
        System.err.println("---------------------------------------------------------");
        for(Class c : is){
            System.err.println(c.toString());
        }

        System.err.println("---------------------------------------------------------");
        for(Method m : ms){
            System.err.println(m.toString());
        }


    }

}
