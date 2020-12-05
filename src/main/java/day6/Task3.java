package day6;

public class Task3 {
    public static void main(String[] args) {

        Student student = new Student("Petr");
        Teacher teacher = new Teacher("Pavel Ivanovich", "OBZH");
        teacher.evaluate(student);
    }
}
