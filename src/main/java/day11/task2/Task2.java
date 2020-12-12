package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior p1 = new Warrior();
        Paladin p2 = new Paladin();
        Magician p3 = new Magician();
        Shaman p4 = new Shaman();

        p1.physicalAttack(p2);
        System.out.println(p2);
        p2.physicalAttack(p3);
        System.out.println(p3);
        p4.healTeammate(p3);
        System.out.println(p3);
        p3.magicalAttack(p2);
        System.out.println(p2);
        p4.physicalAttack(p1);
        System.out.println(p1);
        p2.healHimself();
        System.out.println(p2);

        System.out.println();
        for (int i = 0; i < 5; i++) {
            p1.physicalAttack(p3);
            System.out.println(p3);
        }
    }
}
