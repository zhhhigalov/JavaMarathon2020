package day11.task2;

public class Magician extends Hero implements MagicAttack {

    private int magicAtt = 20;

    public Magician() {
        setHealth(100);
        setPhysAtt(5);
        setPhysDef(0);
        setMagicDef(80);
        System.out.println("Маг создан!");
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (magicAtt - magicAtt * hero.getMagicDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }

    @Override
    public String toString() {
        return "Magician{health=" + getHealth() + "}";
    }
}
