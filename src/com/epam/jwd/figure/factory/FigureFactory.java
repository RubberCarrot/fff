package com.epam.jwd.figure.factory;

import com.epam.jwd.figure.exception.FigureException;
import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;

public interface FigureFactory {
    Figure createFigure(String type, Point[] figureConstituens) throws FigureException;

}
