package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        if (k > 0 && k < 5)
            System.out.println("Малоэтажный дом");
        else if (k > 4 && k < 9)
            System.out.println("Среднеэтажный дом");
        else if (k > 8)
            System.out.println("Многоэтажный дом");
        else
            System.out.println("Ошибка ввода");
    }
}
