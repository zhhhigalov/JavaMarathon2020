package day9.Task2;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double pPerimetr = perimeter() / 2;
        return Math.sqrt(pPerimetr * (pPerimetr - a) * (pPerimetr - b) * (pPerimetr - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}
