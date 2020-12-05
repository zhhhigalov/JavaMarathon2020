package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2018);
        car.setColor("GREY");
        car.setModel("BMW");
        car.info();
        System.out.println("Разница годов " + car.yearDifference(2024));

        Motorbike motorbike = new Motorbike(2006, "GREEN", "YAMAHA");
        motorbike.info();
        System.out.println("Разница годов " + motorbike.yearDifference(2030));
    }
}
