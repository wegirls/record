package com.example.record.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/05/03 21:18
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Resource
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
        // 拦截路径
        .addPathPatterns("/**")
        // 不拦截路径
        .excludePathPatterns("/interceptor/index");
    }
}
