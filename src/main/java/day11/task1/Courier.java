package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private String name;
    private Warehouse houseName;

    public Courier(String name, Warehouse houseName) {
        this.name = name;
        this.houseName = houseName;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Имя курьера: " + name + "\nЗаработная плата: " + salary + "\nБонус: " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        houseName.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (houseName.getCountDeliveredOrders() >= 10000 && !isPayed) {
            salary += 50000;
            isPayed = true;
        } else if (houseName.getCountDeliveredOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        else if (isPayed)
            System.out.println("Бонус уже был выплачен");
    }
}
