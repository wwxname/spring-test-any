package com.example.demo.resolver;

import com.example.demo.MainTest;
import com.example.demo.autoconfigure.HttpEncodingAutoConfiguration;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class ResolverTest {
    public static void main(String arsg[]) {
        // ServerPropertiesAutoConfiguration s = null;
      // HttpEncodingAutoConfiguration httpEncodingAutoConfiguration = null;
        DispatcherServletAutoConfiguration dispatcherServletAutoConfiguration = null;
        ServletWebServerFactoryAutoConfiguration servletWebServerFactoryAutoConfiguration = null;
        WebMvcAutoConfiguration webMvcAutoConfiguration = null;
        JacksonAutoConfiguration jacksonAutoConfiguration = null;
        //MultipartAutoConfiguration multipartAutoConfiguration = null;

    }
}
