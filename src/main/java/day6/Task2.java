package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boieng", 1997, 17, 272);
        airplane.setYear(2001);
        airplane.setLength(21);
        airplane.fillUp(12);
        airplane.fillUp(17);
        airplane.info();
    }
}
