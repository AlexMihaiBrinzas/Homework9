package com.fasttrack.ex1;

public class Electronics extends Product{
    private int length;
    private int height;
    private String width;
    private double weight;

    public Electronics(int price, String name, String description, double quantity) {
        super(price, name, description, (int) quantity);
    }

    public int getLength() {
        return length = 110;
    }

    public int getHeight() {
        return height=120;
    }

    public String getWidth() {
        return width="20";
    }

    public double getWeight() {
        return weight=60;
    }
}
