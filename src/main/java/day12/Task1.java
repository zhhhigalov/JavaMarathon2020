package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("bmw");
        list.add("audi");
        list.add("mercedes");
        list.add("nissan");
        list.add("toyota");
        System.out.println(list);
        list.add(2, "LADA");
        list.remove(0);
        System.out.println(list);
    }
}
