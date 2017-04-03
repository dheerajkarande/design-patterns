package com.example.patterns.structural.adapter;

public class Line implements Shape {

    private final LegacyLine line;

    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.line = new LegacyLine();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void print() {
        line.print(startPoint, endPoint);
    }

}
