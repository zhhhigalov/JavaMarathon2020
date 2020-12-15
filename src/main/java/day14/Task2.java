package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> list = new ArrayList<>();
        try {
            Scanner in = new Scanner(file);
            int counter = 0;
            while (in.hasNextLine()) {
                list.add(in.nextLine());
                String[] array = list.get(counter).split(" ");
                if (Integer.parseInt(array[1]) < 0)
                    throw new IOException();
                counter++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
