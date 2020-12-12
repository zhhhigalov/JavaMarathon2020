package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public Shaman() {
        setHealth(100);
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysDef(20);
        setMagicDef(20);
        System.out.println("Шаман создан!");
    }

    @Override
    public void healHimself() {
        int healH = 50;
        setHealth(Math.min(healH + getHealth(), MAX_HEALTH));
    }

    @Override
    public void healTeammate(Hero hero) {
        int healT = 30;
        hero.setHealth(Math.min(healT + hero.getHealth(), MAX_HEALTH));
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (getMagicAtt() - getMagicAtt() * hero.getMagicDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }

    @Override
    public String toString() {
        return "Shaman{health=" + getHealth() + "}";
    }
}
