package com.example.record;

import com.example.record.listener.MyHttpSessionListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class RecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordApplication.class, args);
    }

    /*@Bean
    public ServletListenerRegistrationBean<MyHttpSessionListener> contextListenerBean() {
        ServletListenerRegistrationBean<MyHttpSessionListener> contextListenerBean= new ServletListenerRegistrationBean<MyHttpSessionListener>();
        contextListenerBean.setListener(new MyHttpSessionListener());
        contextListenerBean.setOrder(1);
        return contextListenerBean;
    }*/

    /*@Bean
    public ServletListenerRegistrationBean<ContextListener> contextListenerBean() {
        ServletListenerRegistrationBean<ContextListener> contextListenerBean= new ServletListenerRegistrationBean<ContextListener>();
        contextListenerBean.setListener(new ContextListener());
        contextListenerBean.setOrder(1);
        return contextListenerBean;
    }*/

}
