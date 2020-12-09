package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student st1 = new Student("Max", "1609");
        Teacher t1 = new Teacher("Victor Victorovich", "Footbal");

        System.out.println(st1.getGroupName());
        System.out.println(t1.getSubjectName());
        st1.printInfo();
        t1.printInfo();
    }
}
