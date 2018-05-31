package com.example.demo.autoconfigure;

import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = MyDemoProperties.DEMO)
public class MyDemoProperties {
    public static final String DEMO = "demo";
    private String name;
    private String[] nicks;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNicks() {
        return nicks;
    }

    public void setNicks(String[] nicks) {
        this.nicks = nicks;
    }
}

