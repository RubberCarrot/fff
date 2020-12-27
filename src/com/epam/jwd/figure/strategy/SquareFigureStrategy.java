package com.epam.jwd.figure.strategy;

import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;

public enum SquareFigureStrategy implements Strategy {
    SQUARE_FIGURE_STRATEGY;

    @Override
    public double perimeter(Figure figure) {
        Point[] points = figure.getArrayOfPoints();
        return Math.sqrt(Math.pow(points[0].getAxisX() - points[1].getAxisX(), 2) + Math.pow(points[0].getAxisY() - points[1].getAxisY(), 2))
                + Math.sqrt(Math.pow(points[1].getAxisX() - points[2].getAxisX(), 2) + Math.pow(points[1].getAxisY() - points[2].getAxisY(), 2))
                + Math.sqrt(Math.pow(points[2].getAxisX() - points[3].getAxisX(), 2) + Math.pow(points[2].getAxisY() - points[3].getAxisY(), 2))
                + Math.sqrt(Math.pow(points[3].getAxisX() - points[0].getAxisX(), 2) + Math.pow(points[3].getAxisY() - points[0].getAxisY(), 2));
    }

    @Override
    public double area(Figure figure) {
        Point[] points = figure.getArrayOfPoints();
        double p = (Math.sqrt(Math.pow(points[0].getAxisX() - points[1].getAxisX(), 2) + Math.pow(points[0].getAxisY() - points[1].getAxisY(), 2))
                + Math.sqrt(Math.pow(points[1].getAxisX() - points[2].getAxisX(), 2) + Math.pow(points[1].getAxisY() - points[2].getAxisY(), 2))
                + Math.sqrt(Math.pow(points[2].getAxisX() - points[3].getAxisX(), 2) + Math.pow(points[2].getAxisY() - points[3].getAxisY(), 2))
                + Math.sqrt(Math.pow(points[3].getAxisX() - points[0].getAxisX(), 2) + Math.pow(points[3].getAxisY() - points[0].getAxisY(), 2)))/2;
        return Math.sqrt((p - Math.sqrt(Math.pow(points[3].getAxisX() - points[0].getAxisX(), 2) + Math.pow(points[3].getAxisY() - points[0].getAxisY(), 2))) *
                (p - Math.sqrt(Math.pow(points[0].getAxisX() - points[1].getAxisX(), 2) + Math.pow(points[0].getAxisY() - points[1].getAxisY(), 2)))
                * (p -Math.sqrt(Math.pow(points[1].getAxisX() - points[2].getAxisX(), 2) + Math.pow(points[1].getAxisY() - points[2].getAxisY(), 2)))
                * (p - Math.sqrt(Math.pow(points[2].getAxisX() - points[3].getAxisX(), 2) + Math.pow(points[2].getAxisY() - points[3].getAxisY(), 2))));
    }
}

