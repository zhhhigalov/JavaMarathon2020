package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("input.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int sum = 0, counter = 0;
        try {
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                sum += in.nextInt();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }

        if (counter == 10) System.out.println(sum);
        else try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
