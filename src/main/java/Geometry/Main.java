package Geometry;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.12, 5.4);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle(3.18, 2.19);
        System.out.println(triangle.getArea());

        Circle circle = new Circle(3.12);
        System.out.println(circle.getArea());

        System.out.println("Exercise 12");
        List<Figure> figures = new LinkedList<>();
        figures.add(rectangle);
        figures.add(circle);
        figures.add(triangle);

        double result = AreaCounter.countArea(figures);
        System.out.println(result);


        Double area = 300.0;
         boolean isEnough = AreaCounter.checkArea(area, figures);
        System.out.println("Feedback if the amount of pain is enough " + isEnough);
    }
}
