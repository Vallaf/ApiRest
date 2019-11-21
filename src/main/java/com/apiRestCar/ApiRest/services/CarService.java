package com.apiRestCar.ApiRest.services;

import com.apiRestCar.ApiRest.entities.Car;
import java.util.List;

public interface CarService {
    Car getCarById(Integer carId);
    void addCar(Car car);
    List<Car> getAllCars();
}
