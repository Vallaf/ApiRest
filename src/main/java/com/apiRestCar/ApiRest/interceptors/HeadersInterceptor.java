package com.apiRestCar.ApiRest.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

@Component
public class HeadersInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) {
        final Enumeration<String> headers = request.getHeaders("car");
        final List<String> cars = Collections.list(headers);

        if(!cars.isEmpty()){
            String carName = cars.get(0);
            this.applicationContext.setCar(carName);
        }

        return true;
    }
}
