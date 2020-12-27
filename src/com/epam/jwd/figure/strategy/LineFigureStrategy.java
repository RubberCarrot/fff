package com.epam.jwd.figure.strategy;

import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;

public class LineFigureStrategy implements Strategy {
    private static LineFigureStrategy instance;

    private LineFigureStrategy(){

    }

    public static LineFigureStrategy getInstance(){
        if (instance == null){
            instance = new LineFigureStrategy();
        }
        return instance;
    }

    @Override
    public double perimeter(Figure figure) {
        Point[] points = figure.getArrayOfPoints();
        return Math.sqrt(Math.pow(points[0].getAxisX() - points[1].getAxisX(), 2) + Math.pow(points[0].getAxisY() - points[1].getAxisY(), 2));
    }

    @Override
    public double area(Figure figure) {
        return 0;
    }
}
