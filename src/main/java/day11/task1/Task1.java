package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse h1 = new Warehouse();
        Courier c1 = new Courier("Max", h1);
        Picker p1 = new Picker("Dima", h1);
        businessProcess(p1);
        businessProcess(c1);
        System.out.println(h1);
        System.out.println(c1);
        System.out.println(p1);

        Warehouse h2 = new Warehouse();
        Courier c2 = new Courier("Dmitriy", h2);
        Picker p2 = new Picker("Alexander", h2);
        c2.doWork();
        p2.doWork();

        System.out.println("---------------");
        System.out.println(h1);
        System.out.println(c1);
        System.out.println(p1);
    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}


