package Geometry;

import java.util.List;

public class AreaCounter {
    public static Double countArea(List<Figure> figures) {
        Double sumArea = 0.0;
        for (Figure figure : figures) {
        sumArea = sumArea + figure.getArea();
        }
        return sumArea;
    }
    //TODO Exercise 13
    public static boolean checkArea(Double area, List<Figure> figures ){
        return true;
    }
}
