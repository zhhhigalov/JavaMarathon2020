package day6;

import java.util.Random;

public class Teacher {

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    private String name;
    private String lesson;

    public void evaluate(Student s){
        Random random = new Random();
        int rating = random.nextInt(4) + 2;
        String str;
        if (rating == 5) str = "отлично";
        else if (rating == 4) str = "хорошо";
        else if (rating == 3) str = "удовлетворительно";
        else str = "неудовлетворительно";
        System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() + " по предмету " + lesson + " на оценку " + str + ".");
    }
}
