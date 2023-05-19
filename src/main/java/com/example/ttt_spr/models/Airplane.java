package com.example.ttt_spr.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airplane {
    private int ID;
    private String company;
    private int year;
    private int seats;
}
