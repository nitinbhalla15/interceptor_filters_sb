package com.project.intercept_filter.configurations;

import com.project.intercept_filter.interceptor.CustomInterceptor;
import com.project.intercept_filter.interceptor.CustomInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor()).addPathPatterns("/intercept/start/**")
                .excludePathPatterns("/intercept/start2/**");
        registry.addInterceptor(new CustomInterceptor2()).addPathPatterns("/intercept/start2/**")
                .excludePathPatterns("/intercept/start/**");
    }
}
