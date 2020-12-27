package com.epam.jwd.figure.model;

public class MultiAngleFigure extends Figure {
    Point[] points;

    public MultiAngleFigure(Point[] points) {
        super("multiAngle", "multiAngleFigureStrategy");
        this.points = points;
    }

    @Override
    public boolean checkUniq() {
        return false;
    }

    @Override
    public Point[] getArrayOfPoints() {
        return new Point[0];
    }
}
