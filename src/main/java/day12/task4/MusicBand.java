package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.members.addAll(a.members);
        a.members.clear();
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println("Участники групы " + name);
        for (String str : getMembers()) {
            System.out.println(str);
        }
    }
}
