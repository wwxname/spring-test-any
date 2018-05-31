package com.example.demo;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.lang.annotation.*;
import java.util.Collection;
import java.util.Set;

@EnableAspectJAutoProxy
public class RegstrarTest {

    public static void main(String args[]) {
        boolean useDefaultFilters = false;//是否使用默认的filter，使用默认的filter意味着只扫描那些类上拥有Component、Service、Repository或Controller注解的类。
        String basePackage = "com.example.demo.domain";
        ClassPathScanningCandidateComponentProvider beanScanner = new ClassPathScanningCandidateComponentProvider(useDefaultFilters);
        TypeFilter includeFilter1 = new AnnotationTypeFilter(Entity.class);
        TypeFilter includeFilter2 = new AnnotationTypeFilter(Table.class);
        beanScanner.addIncludeFilter(includeFilter1);
        beanScanner.addIncludeFilter(includeFilter2);
       // beanScanner.ad
        Set<BeanDefinition> beanDefinitions = beanScanner.findCandidateComponents(basePackage);

        for (BeanDefinition beanDefinition : beanDefinitions) {
            String beanName = beanDefinition.getBeanClassName();
           String s = beanDefinition.getBeanClassName();
           //beanDefinition.me
            ScannedGenericBeanDefinition scannedGenericBeanDefinition = (ScannedGenericBeanDefinition)(beanDefinition);

            System.err.println(beanName+s);

        }
    }


}

class DemoRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(Demo.class);
        registry.registerBeanDefinition("wwx",beanDefinition);
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DemoRegistrar.class)
@interface EnableDemoAutoCreate {

}
@EnableDemoAutoCreate
class Demo{
    public void test(){
        System.err.println("----------");
    }
}
