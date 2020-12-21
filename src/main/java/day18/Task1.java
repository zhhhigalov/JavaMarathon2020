package day18;

public class Task1 {

    static int index;

    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
        int[] numbers2 = {402, -50, -249, 215, 665, 311};
        System.out.println(recursionSum(numbers2));
        int[] numbers3 = {-402, -50, -249, -15, -665, -311};
        System.out.println(recursionSum(numbers3));
    }

    public static int recursionSum(int[] a) {
        if (a.length == 0) return 0;
        if (a.length - 1 == index) {
            index = 0;
            return a[a.length - 1];
        }
        return a[index++] + recursionSum(a);
    }
}
