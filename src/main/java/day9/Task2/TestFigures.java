package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(TestFigures.calculateRedArea(figures));
        System.out.println(TestFigures.calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerRed = 0;
        for (Figure i :
                figures) {
            if (i.getColor().equals("Red"))
                sumPerRed += i.perimeter();
        }
        return sumPerRed;
    }


    public static double calculateRedArea(Figure[] figures) {
        double sumAreaRed = 0;
        for (Figure i :
                figures) {
            if (i.getColor().equals("Red"))
                sumAreaRed += i.area();
        }
        return sumAreaRed;
    }
}
