package L.fixed;

public class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    
}
