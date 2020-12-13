package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    public static final int HEAL_H = 50;
    public static final int HEAL_T = 30;
    private int magicAtt = 15;

    public Shaman() {
        setHealth(100);
        setPhysAtt(10);
        setPhysDef(20);
        setMagicDef(20);
        System.out.println("Шаман создан!");
    }

    @Override
    public void healHimself() {
        setHealth(Math.min(HEAL_H + getHealth(), MAX_HEALTH));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(HEAL_T + hero.getHealth(), MAX_HEALTH));
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (magicAtt - magicAtt * hero.getMagicDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }

    @Override
    public String toString() {
        return "Shaman{health=" + getHealth() + "}";
    }
}
