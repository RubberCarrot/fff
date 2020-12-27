package com.epam.jwd.figure.factory;

import com.epam.jwd.figure.exception.FigureNotExistsException;
import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Line;
import com.epam.jwd.figure.model.Point;
import com.epam.jwd.figure.model.Square;
import com.epam.jwd.figure.model.Triangle;

import java.util.Random;

public enum Factory {
    FACTORY;

    public Figure create(String type) throws FigureNotExistsException {
        switch(type){
            case "line":
                return new Line(new Point(randomValue(), randomValue()), new Point(randomValue(), randomValue()));
            case "triangle":
                return new Triangle(new Point(randomValue(), randomValue()), new Point(randomValue(), randomValue()), new Point(randomValue(), randomValue()));
            case "square":
                return new Square(new Point(randomValue(), randomValue()), new Point(randomValue(), randomValue()), new Point(randomValue(), randomValue()), new Point(randomValue(), randomValue()));
            default:
                return null;
        }
    }

    private static double randomValue(){
        Random r = new Random();
        double min_value = 0.1;
        double max_value = 100;
        return min_value + (max_value - min_value) * r.nextDouble();
    }
}
