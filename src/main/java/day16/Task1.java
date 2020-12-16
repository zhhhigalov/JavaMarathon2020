package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File f = new File("numbers.txt");
        printResult(f);
    }

    public static void printResult(File file) {
        try {
            Scanner in = new Scanner(file);
            int counter = 1;
            double sum = in.nextInt();
            while (in.hasNextInt()) {
                sum += in.nextInt();
                counter++;
            }
            double result = sum / counter;
            System.out.print(result + " --> ");
            System.out.printf("%.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

