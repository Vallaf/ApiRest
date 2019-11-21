package com.apiRestCar.ApiRest.config;


import com.apiRestCar.ApiRest.interceptors.HeadersInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorsConfig implements WebMvcConfigurer {

    @Autowired
    private HeadersInterceptor headersInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.headersInterceptor)
                .addPathPatterns("/cars/**")
                .excludePathPatterns("/cars/public/**");
    }
}
