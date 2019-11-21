package com.apiRestCar.ApiRest.repositories;

import com.apiRestCar.ApiRest.entities.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryInMemory implements CarRepository{
    private ArrayList<Car>cars;

    public CarRepositoryInMemory() {
        this.cars = new ArrayList<>();
    }

    public Car getCarById(Integer carId) {
        for(Car b : this.cars){
            if(b.getId() == carId) return b;
        }

        return null;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> getAllCars() {
        return this.cars;
    }

}
