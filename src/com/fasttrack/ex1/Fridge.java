package com.fasttrack.ex1;

public class Fridge extends Electronics{
    private double temperature;


    public Fridge(int length, int heigh, int widt, double weight) {
        super(length, String.valueOf(heigh), String.valueOf(widt),weight);
    }

    public double getTemperature() {
        return temperature =-15;
    }
}
