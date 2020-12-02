package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a, b;

        while (true){
            a = in.nextDouble();
            b = in.nextDouble();
            if (b == 0)
                break;
            else System.out.println(a / b);
        }
    }
}
