package com.example.ttt_spr.controllers;

import com.example.ttt_spr.models.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

  @GetMapping("/cars")
  public Object getCar(){
      Car car = new Car();
      car.setID(11);
      car.setManufacturer("BMW");
      car.setYear(2019);

      return car;
  }

    @GetMapping("/")
    public String GetHello(){
        return "Hello! We are happy to see you in our website!";
    }

}
