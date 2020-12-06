package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane a1 = new Airplane("boieng", 2007, 2000, 756);
        Airplane a2 = new Airplane("boieng", 2010, 2000, 950);
        Airplane.compareAirplanes(a1, a2);
    }
}