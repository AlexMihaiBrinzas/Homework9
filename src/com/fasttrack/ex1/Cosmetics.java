package com.fasttrack.ex1;

public class Cosmetics extends Product{

    private float color;

    private double weight;


    public Cosmetics(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);

    }

    public float getColor() {
        return color=5;
    }

    public double getWeight() {
        return weight=70;
    }
}
