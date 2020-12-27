package com.epam.jwd.figure.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Figure {
    private String type;
    private String figurePropertiesStrategy;

    public Figure(String type, String figurePropertiesStrategy) {
        this.type = type;
        this.figurePropertiesStrategy = figurePropertiesStrategy;
    }

    abstract public boolean checkUniq();
    abstract public Point[] getArrayOfPoints();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return Objects.equals(type, figure.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getFigurePropertiesStrategy() {
        return figurePropertiesStrategy;
    }
}
