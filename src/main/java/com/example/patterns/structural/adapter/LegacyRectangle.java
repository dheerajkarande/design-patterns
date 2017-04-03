package com.example.patterns.structural.adapter;

public class LegacyRectangle {

    public void print(Point upperLeftPoint, Point bottomRightPoint) {
        System.out.println("Rectangle Starting at " + upperLeftPoint.toString() + " Ending at: " + bottomRightPoint
                .toString());
    }

}
