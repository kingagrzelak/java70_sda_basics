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

    //TODO Exercise 12
    public static boolean checkArea(Double area, List<Figure> figures ){
        Double result = countArea(figures);

        return result<= area;
    }
}
