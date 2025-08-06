package com.yuvraj;

class Bike_ {
    String brand = "Royal Enfield";

    public void start() {
        System.out.println("Bike started: " + brand);
    }
}

public class Task14 {

    public static void main(String[] args) {
        Bike_ b = new Bike_();
        b.start();
    }
}
