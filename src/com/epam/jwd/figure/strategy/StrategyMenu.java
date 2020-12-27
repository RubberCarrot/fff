package com.epam.jwd.figure.strategy;

import com.epam.jwd.figure.model.Figure;

public class StrategyMenu {
    public static void strategyMenuList(Figure figure){
        switch (figure.getFigurePropertiesStrategy()){
            case "lineFigureStrategy":
                LineFigureStrategy lineFigureStrategy = LineFigureStrategy.getInstance();
                lineFigureStrategy.area(figure);
                lineFigureStrategy.perimeter(figure);
                break;
            case "triangleFigureStrategy":
                TriangleFigureStrategy triangleFigureStrategy = TriangleFigureStrategy.getInstance();
                triangleFigureStrategy.area(figure);
                triangleFigureStrategy.perimeter(figure);
                break;
            case "squareFigureStrategy":
                SquareFigureStrategy.SQUARE_FIGURE_STRATEGY.area(figure);
                SquareFigureStrategy.SQUARE_FIGURE_STRATEGY.perimeter(figure);
                break;
            default:
                System.out.println("Wrong strategy");;
        }
    }
}
