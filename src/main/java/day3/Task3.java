package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count=0;
        double a, b, result;
        do{
            ++count;
            a = in.nextDouble();
            b = in.nextDouble();
            System.out.println((b == 0) ? "Деление на 0" : (result = a / b));
        }while(count<5);
    }
}
