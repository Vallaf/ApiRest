package com.apiRestCar.ApiRest.interceptors;

import org.springframework.stereotype.Component;

@Component
public class ApplicationContext {

    private String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}