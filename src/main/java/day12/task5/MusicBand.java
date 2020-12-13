package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println("Участники групы " + name);
        for (MusicArtist MusicArtist : getMembers()) {
            System.out.println(MusicArtist.getName() + " " + MusicArtist.getAge());
        }
    }
}
