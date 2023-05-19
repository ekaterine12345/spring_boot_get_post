package com.example.ttt_spr.controllers;

import com.example.ttt_spr.models.Airplane;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirplaneController {

    @GetMapping("/airplane")
    public Object getAirplane(){
        Airplane airplane = new Airplane();
        airplane.setID(12);
        airplane.setCompany("Georgian Airlines");
        airplane.setSeats(200);
        airplane.setYear(2020);
        return airplane;
    }

    @PostMapping("/air")
    public Object getAirplane2(){
        Airplane airplane = new Airplane();
        airplane.setID(121);
        airplane.setCompany("Georgian AirPlanes");
        airplane.setSeats(205);
        airplane.setYear(2021);
        return airplane;
    }
 /*   const url = 'http://localhost:8181/air';

    fetch(url, {
        method: 'POST',
    })
            .then(response => response.json())
            .then(data => {
        console.log('Response:', data);
        // Handle the response data here
    })
            .catch(error => {
        console.error('Error:', error);
        // Handle any errors that occur during the request
    }); */
}
