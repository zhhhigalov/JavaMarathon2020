package day6;

public class Motorbike {

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return Math.abs(year - this.year);
    }
}
