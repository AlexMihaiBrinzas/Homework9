package com.fasttrack.ex1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cosmetics");

        Cosmetics cosmetics =new Cosmetics(5,"Sampon","spalat",3);
        System.out.println(cosmetics);
        System.out.println(cosmetics.getPrice());
        System.out.println(cosmetics.getName());
        System.out.println(cosmetics.getDescription());
        System.out.println(cosmetics.getQuantity());

        System.out.println(cosmetics.getColor());
        System.out.println(cosmetics.getWeight());



        System.out.println("------------");
        System.out.println("Electronics");

        Electronics electronics =new Electronics(10,"Radio","relaxare",5);
        System.out.println(electronics);
        System.out.println(electronics.getName() +" pentru " + electronics.getDescription());

        System.out.println(electronics.getHeight());
        System.out.println(electronics.getLength());
        System.out.println(electronics.getWeight());
        System.out.println(electronics.getWidth());


        System.out.println("------------");
        System.out.println("Fridge");

        Fridge fridge=new Fridge(110,120,20,60);
        System.out.println(fridge);
        System.out.println("Fridge lenght is : "+fridge.getLength());
        System.out.println("Fridge heigh is : "+fridge.getHeight());
        System.out.println(fridge.getTemperature() + " Degrees");


    }
}
