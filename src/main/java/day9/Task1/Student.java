package day9.Task1;

public class Student extends Human{

    private String groupName;

    public Student(String name, String nameGroup) {
        super(name);
        this.groupName = nameGroup;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот студент с именем " + super.getName());
    }
}
