package com.company;

public class Box {
    double width;
    double height;
    double depth;

    //Constructor
    Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //method
    void volume() {
        double volume = depth * height * width;
        System.out.println("Volume is " + volume);
    }
}

