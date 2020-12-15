package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("src/main/resources/shoes.csv"));
        PrintWriter out = new PrintWriter("src/main/resources/missing_shoes.txt");

        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] array = str.split(";");
            if (Integer.parseInt(array[2]) == 0)
                out.println(str);
        }
        in.close();
        out.close();


    }
}
