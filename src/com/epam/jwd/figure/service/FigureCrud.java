package com.epam.jwd.figure.service;

import com.epam.jwd.figure.exception.FigureException;
import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Point;

public interface FigureCrud {
    Figure create(String type, Point[] points) throws FigureException;
    //Figure[] multiCreate(String... type) throws FigureException;
    void delete(Figure figure) throws FigureException;
    Figure[] find(String type) throws FigureException;
    Figure updtate(Figure figure) throws FigureException;
    Figure findById(Integer id) throws FigureException;
    //Figure findByCategory() throws FigureException;
}
