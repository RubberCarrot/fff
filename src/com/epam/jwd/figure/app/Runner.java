package com.epam.jwd.figure.app;

import com.epam.jwd.figure.exception.FigureException;
import com.epam.jwd.figure.factory.Factory;
import com.epam.jwd.figure.model.Figure;
import com.epam.jwd.figure.model.Line;
import com.epam.jwd.figure.model.Point;
import com.epam.jwd.figure.model.Square;
import com.epam.jwd.figure.model.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

public class Runner {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws FigureException {
        LOGGER.debug("started");

        ArrayList<Point> arrayListPoints = new ArrayList<>(1);
        int i = 0;
        do{
            arrayListPoints.add(new Point(randomValue(), randomValue()));
            LOGGER.info(arrayListPoints.get(i).toString());
            i++;
        }while (i < 4);



        ArrayList<Figure> arrayListLines = new ArrayList<>(2);
        arrayListLines.add(Factory.FACTORY.create("line"));
        arrayListLines.add(Factory.FACTORY.create("line"));
        arrayListLines.add(Factory.FACTORY.create("triangle"));
        arrayListLines.add(Factory.FACTORY.create("triangle"));
        arrayListLines.add(Factory.FACTORY.create("square"));

        getArrayInfo(arrayListLines);

        LOGGER.debug("finished");
    }

    private static double randomValue(){
        Random r = new Random();
        double min_value = 0.1;
        double max_value = 100;
        return min_value + (max_value - min_value) * r.nextDouble();
    }

    private static void getArrayInfo(ArrayList<Figure> figures){
        for (Figure figure :
                figures) {
            if(figure.checkUniq()){
                LOGGER.info(figure.toString());
            } else {
                LOGGER.error("not " + figure.getType());
            }

        }
    }

}
