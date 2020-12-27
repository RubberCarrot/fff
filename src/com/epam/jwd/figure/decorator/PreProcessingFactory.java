package com.epam.jwd.figure.decorator;

import com.epam.jwd.figure.exception.FigureException;
import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;

public class PreProcessingFactory extends FigureFactoryDecorator {
    @Override
    public Figure createFigure(String type, Point[] figureConstituens) throws FigureException {
        return null;
    }
}
