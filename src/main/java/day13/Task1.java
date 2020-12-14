package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Max");
        User user2 = new User("Sasha");
        User user3 = new User("Masha");

        user1.sendMessage(user2, "Privet user 2 (Sasha)");
        user1.sendMessage(user2, "Kak tvoi dela?");
        user2.sendMessage(user1, "Rada tebya slyashat' user1 (Max)");
        user2.sendMessage(user1, "U menya vse otlishno, uchu Javu");
        user2.sendMessage(user1, "Poka ne ochen vichodit no ya starauas");
        user3.sendMessage(user1, "Privet Max, ne hochesh s namy vmeste izhuchat' Java?");
        user3.sendMessage(user1, "Ya s Sashei nashli i proxodim otlichnyi kurs kak raz");
        user3.sendMessage(user1, "Est' eshe mesta i mozho uspet' zapisat'sya");
        user1.sendMessage(user3, "Wou, eto zhe zdorova! Mne vsegda eto nravilas', no sam ya tak i ne smog osvoit' vse programmu");
        user1.sendMessage(user3, "Bistro govori kuda zapisat'sya chtoby poskoree nachat' vmeste s vami");
        user3.sendMessage(user1, "Togda neotkladivay i podpisivaisya na telegram kanal t.me/alishev_g. I udachi tebe!");

        MessageDatabase.showDialog(user1, user2);
        MessageDatabase.showDialog(user1, user3);

    }
}
