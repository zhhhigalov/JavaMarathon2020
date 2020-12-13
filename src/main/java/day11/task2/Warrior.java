package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        setHealth(100);
        setPhysAtt(30);
        setPhysDef(80);
        System.out.println("Воин создан!");
    }

    @Override
    public String toString() {
        return "Warrior{health=" + getHealth() + "}";
    }
}
