package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum, n1, n8, even, odd, n = in.nextInt();
        sum = n1 = n8 = even = odd = 0;
        int array[] = new int[n];


        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
            sum += array[i];
            if (array[i] > 8) ++n8;
            if (array[i] == 1) ++n1;
            if (array[i] % 2 == 0) ++even;
            else ++odd;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + n8);
        System.out.println("Количество чисел равных 1: " + n1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
