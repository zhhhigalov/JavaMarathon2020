package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician() {
        setHealth(100);
        setPhysAtt(5);
        setMagicAtt(20);
        setPhysDef(0);
        setMagicDef(80);
        System.out.println("Маг создан!");
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
        return "Magician{health=" + getHealth() + "}";
    }
}
