package L.fixed;

public class Main {
    public static void main(String[] args){
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(4,5);

        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
