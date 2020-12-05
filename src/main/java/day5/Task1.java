package day5;

public class Task1 {
    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.setYearOfRelease(2020);
        newCar.setColor("BLACK");
        newCar.setModel("M320");

        System.out.println("Год выпуска: " + newCar.getYearOfRelease());
        System.out.println("Цвет машины: " + newCar.getColor());
        System.out.println("Модель машины: " + newCar.getModel());
    }
}

class Car {

    private int yearOfRelease;
    private String color;
    private String model;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
