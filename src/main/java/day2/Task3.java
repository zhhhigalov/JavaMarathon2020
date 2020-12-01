package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int n = a;
        if (n >= b)
            System.out.println("Некорректный ввод");
        else
            while (n < b) {
                if (n % 5 == 0 && n % 10 != 0)
                    System.out.print(n + " ");
                ++n;
            }
    }
}
