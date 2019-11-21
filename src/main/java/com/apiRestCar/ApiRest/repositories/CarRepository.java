package com.apiRestCar.ApiRest.repositories;

import com.apiRestCar.ApiRest.entities.Car;
import java.util.List;

public interface CarRepository {
    Car getCarById(Integer carId);
    void addCar(Car car);
    List<Car> getAllCars();
}

