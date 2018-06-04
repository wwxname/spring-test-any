package com.example.demo.test.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Date;
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class PrototypeBean {

    private Long timeMilis;

    public PrototypeBean(){
        timeMilis = (new Date()).getTime();
    }

    public void printTime() {
        System.out.println(timeMilis+"");
    }
}
