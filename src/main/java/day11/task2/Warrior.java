package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        setHealth(100);
        setPhysAtt(30);
        setPhysDef(80);
        System.out.println("Воин создан!");
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }

    @Override
    public String toString() {
        return "Warrior{health=" + getHealth() + "}";
    }
}
