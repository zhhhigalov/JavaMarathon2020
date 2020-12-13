package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();

        list.add(new MusicBand("The Beatles", 1960, new ArrayList<>(Arrays.asList("Paul McCartney", "Ringo Starr"))));
        list.add(new MusicBand("Led Zeppelin", 1968, new ArrayList<>(Arrays.asList("Robert Plant", "Jimmy Page"))));
        list.add(new MusicBand("The Rolling Stones", 1962, new ArrayList<>(Arrays.asList("Mick Jagger", "Keith Richards", "Charlie Watts"))));
        list.add(new MusicBand("Boney M", 1975, new ArrayList<>(Arrays.asList("Maizie Ursula Williams", "Marcia Barrett"))));
        list.add(new MusicBand("ABBA", 1972, new ArrayList<>(Arrays.asList("Agnetha Fältskog", "Björn Ulvaeus"))));
        list.add(new MusicBand("OneRepublic", 2002, new ArrayList<>(Arrays.asList("Paul McCartney", "Ringo Starr"))));
        list.add(new MusicBand("Imagine Dragons", 2008, new ArrayList<>(Arrays.asList("Ryan Tedder"))));
        list.add(new MusicBand("Coldplay", 1996, new ArrayList<>(Arrays.asList("Chris Martin", "Raymond Champion"))));
        list.add(new MusicBand("One Direction", 2010, new ArrayList<>(Arrays.asList("Niall Horan", "Liam Payne"))));
        list.add(new MusicBand("Radiohead", 1985, new ArrayList<>(Arrays.asList("Thom Yorke"))));

        MusicBand.transferMembers(list.get(0), list.get(1));
        list.get(0).printMembers();
        list.get(1).printMembers();
    }
}
