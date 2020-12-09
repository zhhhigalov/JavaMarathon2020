package day9.Task2;

public class Circle extends Figure {

    private double r;

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
