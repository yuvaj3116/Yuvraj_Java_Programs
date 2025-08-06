package com.yuvraj;

class Employeee {
    String name;
    int id;

    Employeee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Employeee e = new Employeee("Sneha", 101);
        e.display();
    }
}
