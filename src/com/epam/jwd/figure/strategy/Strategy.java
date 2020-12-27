package com.epam.jwd.figure.strategy;

import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;

public interface Strategy {
    double perimeter(Figure figure);
    double area(Figure figure);
}
