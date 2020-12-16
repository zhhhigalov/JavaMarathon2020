package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter out1 = new PrintWriter(file1);
        PrintWriter out2 = new PrintWriter(file2);
        Random random = new Random();
        double sum = 0;
        for (int i = 1; i <= 1000; i++) {
            int rand = random.nextInt(101);
            out1.print(rand + " ");
            sum += rand;
            if (i % 20 == 0) {
                out2.print(sum / 20 + " ");
                sum = 0;
            }
        }
        out1.close();
        out2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sumResult = 0;
        Scanner in = new Scanner(file).useLocale(Locale.US);
        while (in.hasNextDouble())
            sumResult += in.nextDouble();
        System.out.println((int) sumResult);
    }
}
