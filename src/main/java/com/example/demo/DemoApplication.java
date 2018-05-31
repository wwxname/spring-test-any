package com.example.demo;

import com.example.demo.conditional.ConditionalOnMyDemo;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.PropertySourcesPropertyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.context.annotation.Conditional;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
@SpringBootApplication
//@EnableAutoConfiguration(exclude = {HibernateJpaAutoConfiguration.class })
//@ConditionalOnWebApplication
//@ConditionalOnMyDemo
//@ConditionalOnProperty
public class DemoApplication {

	public static void main(String[] args) {
		//ConfigurationClassBeanDefinitionReader aaa = null;
		//ConfigurationClassEnhancer configurationClassEnhancer = null;
		ConditionEvaluationReportLoggingListener s =null;

		BeanNameUrlHandlerMapping sss = null;

		PropertySourcesPropertyResolver propertySourcesPropertyResolver = null;

		DefaultListableBeanFactory d =null;

































		SpringApplication.run(DemoApplication.class, args);
	}
}
