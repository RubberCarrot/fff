package com.epam.jwd.figure.model;

import java.util.Objects;

public class Triangle extends Figure {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        super("triangle", "triangleFigureStrategy");
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    @Override
    public boolean checkUniq() {
        return !point1.equals(point2) && !point2.equals(point3) && !point3.equals(point1);
    }

    @Override
    public Point[] getArrayOfPoints() {
        Point[] points = new Point[3];
        points[0] = this.point1;
        points[1] = this.point2;
        points[2] = this.point3;
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(point1, triangle.point1) &&
                Objects.equals(point2, triangle.point2) &&
                Objects.equals(point3, triangle.point3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), point1, point2, point3);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }
}
