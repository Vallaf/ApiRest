package com.apiRestCar.ApiRest.services;

import com.apiRestCar.ApiRest.entities.Car;
import com.apiRestCar.ApiRest.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(final CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public Car getCarById(Integer carId) {
        return this.carRepository.getCarById(carId);
    }

    @Override
    public void addCar(Car car) {
        this.carRepository.addCar(car);
    }

    @Override
    public List<Car> getAllCars() {
        return this.carRepository.getAllCars();
    }
}
