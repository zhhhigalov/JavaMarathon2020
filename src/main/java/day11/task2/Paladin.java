package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin() {
        setHealth(100);
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
        System.out.println("Паладин создан!");
    }

    @Override
    public void healHimself() {
        int healH = 25;
        setHealth(Math.min(healH + getHealth(), MAX_HEALTH));
    }

    @Override
    public void healTeammate(Hero hero) {
        int healT = 10;
        hero.setHealth(Math.max(healT + hero.getHealth(), MAX_HEALTH));
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }

    @Override
    public String toString() {
        return "Paladin{health=" + getHealth() + "}";
    }
}