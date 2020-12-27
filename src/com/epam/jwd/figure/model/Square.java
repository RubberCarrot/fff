package com.epam.jwd.figure.model;

import java.util.Objects;

public class Square extends Figure {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super("square", "squareFigureStrategy");
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                '}';
    }

    @Override
    public boolean checkUniq() {
        return !point1.equals(point2) && !point2.equals(point3) && !point3.equals(point4) && !point4.equals(point1) && !point1.equals(point3) && !point2.equals(point4);
    }

    @Override
    public Point[] getArrayOfPoints() {
        Point[] points = new Point[4];
        points[0] = this.point1;
        points[1] = this.point2;
        points[2] = this.point3;
        points[3] = this.point4;
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Objects.equals(point1, square.point1) &&
                Objects.equals(point2, square.point2) &&
                Objects.equals(point3, square.point3) &&
                Objects.equals(point4, square.point4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), point1, point2, point3, point4);
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

    public Point getPoint4() {
        return point4;
    }
}
