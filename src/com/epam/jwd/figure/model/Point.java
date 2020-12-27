package com.epam.jwd.figure.model;

import java.util.Objects;

public class Point {
    private double axisX;
    private double axisY;

    public Point(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "axisX=" + axisX +
                ", axisY=" + axisY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return axisX == point.axisX &&
                axisY == point.axisY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(axisX, axisY);
    }

    public double getAxisX() {
        return axisX;
    }

    public double getAxisY() {
        return axisY;
    }
}
