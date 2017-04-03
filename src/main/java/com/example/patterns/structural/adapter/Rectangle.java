package com.example.patterns.structural.adapter;

public class Rectangle implements Shape {

    private final LegacyRectangle rectangle;

    private Point upperLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point upperLeftPoint, Point bottomRightPoint) {
        this.rectangle = new LegacyRectangle();
        this.upperLeftPoint = upperLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    @Override
    public void print() {
        rectangle.print(upperLeftPoint, bottomRightPoint);
    }
}
