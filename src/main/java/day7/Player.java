package day7;

public class Player {

    private static final int MAX_PLAYERS = 6;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < MAX_PLAYERS) ++countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 1) {
            stamina--;
            countPlayers--;
        } else if (stamina > 1) stamina--;


    }

    public static void info() {
        if (countPlayers < MAX_PLAYERS)
            System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
