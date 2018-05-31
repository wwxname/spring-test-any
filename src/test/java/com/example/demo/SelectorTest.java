package com.example.demo;

import org.springframework.cache.annotation.CachingConfigurationSelector;
import org.springframework.context.annotation.*;
import org.springframework.lang.Nullable;
import com.example.demo.AConfig;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SelectorTest {

    public static  void main(String args[]){
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DaseBoot.class);
        AB a = (AB)configApplicationContext.getBean("a");
        a.test();

    }
}

class  DataBaseConfigurationSelector extends AdviceModeImportSelector<EnableDataBase>{
    private String a = "com.example.demo.AConfig";

    private String b = "com.example.demo.BConfig";


    @Nullable
    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{a};
            case ASPECTJ:
                return new String[]{b};
            default:
                return null;
        }
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DataBaseConfigurationSelector.class)
@interface EnableDataBase{
    AdviceMode mode() default AdviceMode.PROXY;
}
@EnableDataBase(mode = AdviceMode.PROXY)
class DaseBoot{

}
@Configuration
class AConfig {
    class A implements AB{
        public void test(){
            System.err.println("a");
        }
    }
    @Bean(name = "a")
    public A tttt(){
       return new A();
    }

}
@Configuration
class BConfig {
    class B implements AB{
        @Override
        public void test() {
            System.err.println("b");
        }
    }
    @Bean(name = "a")
    public B tttt(){
        return new B();
    }

}
interface AB{
    public void test();
}
