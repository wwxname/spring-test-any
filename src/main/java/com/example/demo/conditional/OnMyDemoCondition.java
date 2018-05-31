package com.example.demo.conditional;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.StandardServletEnvironment;

public class OnMyDemoCondition extends SpringBootCondition {
    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String name =  ConditionalOnMyDemo.class.getName();
        boolean required = metadata
                .isAnnotated(name);
        System.err.println(context.toString());
        BeanFactory factory = context.getBeanFactory();
        WebApplicationContext webApplicationContext = (WebApplicationContext) context.getResourceLoader();
        StandardServletEnvironment standardServletEnvironment = (StandardServletEnvironment) context.getEnvironment();
        return ConditionOutcome.match("hao wu  li you");
    }
}
