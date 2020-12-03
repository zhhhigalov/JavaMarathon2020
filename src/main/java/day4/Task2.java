package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int max = 0, min = 10000, n0 = 0, sumN0 = 0;
        Random rand = new Random();
        int array[] = new int[100];
        for (int i = 0; i < 100; i++)
            array[i] = rand.nextInt(10000);

        for (int i :
                array) {
            if (i > max) max = i;
            if (i < min) min = i;
            if (i % 10 == 0) {
                ++n0;
                sumN0 += i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + n0);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + sumN0);
    }
}
