package com.apiRestCar.ApiRest.controllers;

import com.apiRestCar.ApiRest.entities.Car;
import com.apiRestCar.ApiRest.services.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "Car management")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(final CarService carService){ this.carService = carService; }

    //Récupérer un produit par son Id
    @RequestMapping(value="/Cars/{carId}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "Get car by ID")
    Car getCarById(@PathVariable final Integer carId) {
        return this.carService.getCarById(carId);
    }

    @RequestMapping(value="/Cars", method= RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "Get all cars")
    List<Car> getAllCars() { return this.carService.getAllCars();
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Add a car")
    void addCar(@RequestBody Car car){
        this.carService.addCar(car);
    }

 }
