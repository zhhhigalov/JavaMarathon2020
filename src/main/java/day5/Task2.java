package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike newMotorbike = new Motorbike(2021, "RED", "Bike001");

        System.out.println("Год выпуска: " + newMotorbike.getYearOfRelease());
        System.out.println("Цвет машины: " + newMotorbike.getColor());
        System.out.println("Модель машины: " + newMotorbike.getModel());
    }
}

class Motorbike {

    Motorbike(int yearOfRelease, String color, String model) {
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;
    }

    private int yearOfRelease;
    private String color;
    private String model;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
