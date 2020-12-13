package day11.task2;

public abstract class Hero implements PhysAttack {
    final static int MAX_HEALTH = 100;
    final static int MIN_HEALTH = 0;
    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;

    public Hero() {
        health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100);
        hero.setHealth(Math.max(hero.getHealth() - damage, MIN_HEALTH));
    }
}
