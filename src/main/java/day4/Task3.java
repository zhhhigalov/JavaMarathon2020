package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int max = 0, imax = 0;
        int array[][] = new int[12][8];
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                array[i][j] = rand.nextInt(50);
                sum += array[i][j];
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("// Сумма элементов строки " + sum);
            if (sum >= max) {
                max = sum;
                imax = i;
            }
        }

        System.out.println("Индекс строки с последней максимальной суммой равен: " + imax);

    }
}
