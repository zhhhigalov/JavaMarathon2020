package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel){
        this.fuel += fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2){
        if (a1.length == a2.length)
            System.out.println("Длины самолетов равны");
        else if (a1.length > a2.length)
            System.out.println("Первый самолет длиннее");
        else System.out.println("Второй самолет длиннее");
    }
}
