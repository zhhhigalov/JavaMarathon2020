package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("The Beatles", 1960));
        list.add(new MusicBand("Led Zeppelin", 1968));
        list.add(new MusicBand("The Rolling Stones", 1962));
        list.add(new MusicBand("Boney M", 1975));
        list.add(new MusicBand("ABBA", 1972));
        list.add(new MusicBand("OneRepublic", 2002));
        list.add(new MusicBand("Imagine Dragons", 2008));
        list.add(new MusicBand("Coldplay", 1996));
        list.add(new MusicBand("One Direction", 2010));
        list.add(new MusicBand("Radiohead", 1985));
        Collections.shuffle(list);

        System.out.println(list);
        System.out.println(groupsAfter2000(list));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> listAfter2000 = new ArrayList<>();

        for (MusicBand i : bands) {
            if (i.getYear() > 2000)
                listAfter2000.add(i);
        }
        return listAfter2000;
    }
}
