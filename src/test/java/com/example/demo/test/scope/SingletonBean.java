package com.example.demo.test.scope;


import org.hibernate.annotations.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;


@Scope("singleton")
@Component
public class SingletonBean {
    @Autowired
    private PrototypeBean prototype;

    public void printTime() {
        prototype.printTime();
    }

    public void setPrototype(PrototypeBean prototype) {
        this.prototype = prototype;
    }

    public PrototypeBean getPrototype() {
        return prototype;
    }
}
