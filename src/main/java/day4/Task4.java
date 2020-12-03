package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int max = 0, imax = 0;
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(10000);
        }

        for (int i = 0; i < 100 - 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += array[i + j];
            if (sum >= max) {
                max = sum;
                imax = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная сумма трех соседних элементов: " + max);
        System.out.println("Индекс первого элемента этой тройки: " + imax);
    }
}
