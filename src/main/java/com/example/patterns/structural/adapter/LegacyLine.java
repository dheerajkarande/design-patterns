package com.example.patterns.structural.adapter;

public class LegacyLine {

    public void print(Point startPoint, Point endPoint) {
        System.out.println("Line Starting at " + startPoint.toString() + " Ending at: " + endPoint.toString());
    }

}
