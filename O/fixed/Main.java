package O.fixed;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(4, 6));
        shapes.add(new Circle(3));

        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Total Area: " + calculator.calculateTotalArea(shapes));
    }
}
