package day11.task2;

public class Paladin extends Hero implements Healer {

    public static final int HEAL_H = 25;
    public static final int HEAL_T = 10;

    public Paladin() {
        setHealth(100);
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
        System.out.println("Паладин создан!");
    }

    @Override
    public void healHimself() {
        setHealth(Math.min(HEAL_H + getHealth(), MAX_HEALTH));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.max(HEAL_T + hero.getHealth(), MAX_HEALTH));
    }

    @Override
    public String toString() {
        return "Paladin{health=" + getHealth() + "}";
    }
}