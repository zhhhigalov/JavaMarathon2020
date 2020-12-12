package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private String name;
    private Warehouse houseName;

    public Picker(String name, Warehouse houseName) {
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
        return "Имя сборщика: " + name + "\nЗаработная плата: " + salary + "\nБонус: " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        houseName.setCountPickedOrders(1);
    }

    @Override
    public void bonus() {
        if (houseName.getCountPickedOrders() >= 10000 && !isPayed) {
            salary += 70000;
            isPayed = true;
        } else if (houseName.getCountPickedOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        else if (isPayed)
            System.out.println("Бонус уже был выплачен");
    }
}
