package day8;

public class Task1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String s1 = "0";
        for (int i = 1; i <= 2000; i++) {
            s1 += " " + i;
        }
        System.out.println(s1);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder("0");
        for (int i = 1; i <= 2000; i++) {
            s2.append(" ");
            s2.append(i);
        }
        System.out.println(s2);
        System.out.println(System.currentTimeMillis() - start);
    }
}
