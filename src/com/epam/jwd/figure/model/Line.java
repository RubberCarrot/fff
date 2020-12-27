package com.epam.jwd.figure.model;

import java.util.Objects;

public class Line extends Figure {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        super("line", "line");
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public boolean checkUniq() {
        return !point1.equals(point2);
    }

    @Override
    public Point[] getArrayOfPoints() {
        Point[] points = new Point[2];
        points[0] = this.point1;
        points[1] = this.point2;
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        if (!super.equals(o)) return false;
        Line line = (Line) o;
        return Objects.equals(point1, line.point1) &&
                Objects.equals(point2, line.point2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), point1, point2);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }
}
