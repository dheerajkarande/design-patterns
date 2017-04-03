package com.example.patterns.structural.adapter;

public class Point {

    private int xCoordinate;
    private int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (getxCoordinate() != point.getxCoordinate()) return false;
        return getyCoordinate() == point.getyCoordinate();
    }

    @Override
    public int hashCode() {
        int result = getxCoordinate();
        result = 31 * result + getyCoordinate();
        return result;
    }

    @Override
    public String toString() {
        return "X: " + this.getxCoordinate() + " Y: " + this.getyCoordinate();
    }

}
