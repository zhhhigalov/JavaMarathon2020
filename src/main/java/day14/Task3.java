package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {

        List<Person> list = new ArrayList<>();

        try {
            int counter = 0;
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String[] array = in.nextLine().split(" ");
                if (Integer.parseInt(array[1]) >= 0)
                    list.add(new Person(array[0], Integer.parseInt(array[1])));
                else throw new IOException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            list.clear();
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            list.clear();
        }
        return list;
    }
}

class Person {
    private String name;
    private int year;

    public Person(String name, int age) {
        this.name = name;
        this.year = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
