package com.epam.jwd.figure.service.impl;

import com.epam.jwd.figure.exception.FigureException;
import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;
import com.epam.jwd.figure.service.FigureCrud;

public class FigureCrudImpl implements FigureCrud {
    @Override
    public Figure create(String type, Point[] points) throws FigureException {
        return null;
    }

    @Override
    public void delete(Figure figure) throws FigureException {

    }

    @Override
    public Figure[] find(String type) throws FigureException {
        return new Figure[0];
    }

    @Override
    public Figure updtate(Figure figure) throws FigureException {
        return null;
    }

    @Override
    public Figure findById(Integer id) throws FigureException {
        return null;
    }
}
