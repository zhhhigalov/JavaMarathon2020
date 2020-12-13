package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();

        list.add(new MusicBand("The Beatles", 1960, new ArrayList<>(Arrays.asList(new MusicArtist("Paul McCartney", 56), new MusicArtist("Ringo Starr", 47)))));
        list.add(new MusicBand("Led Zeppelin", 1968, new ArrayList<>(Arrays.asList(new MusicArtist("Robert Plant", 45), new MusicArtist("Jimmy Page", 52)))));
        list.add(new MusicBand("The Rolling Stones", 1962, new ArrayList<>(Arrays.asList(new MusicArtist("Mick Jagger", 53), new MusicArtist("Keith Richards", 46), new MusicArtist("Charlie Watts", 61)))));
        list.add(new MusicBand("Boney M", 1975, new ArrayList<>(Arrays.asList(new MusicArtist("Maizie Ursula Williams", 52), new MusicArtist("Marcia Barrett", 47)))));
        list.add(new MusicBand("ABBA", 1972, new ArrayList<>(Arrays.asList(new MusicArtist("Agnetha Fältskog", 39), new MusicArtist("Björn Ulvaeus", 41)))));
        list.add(new MusicBand("OneRepublic", 2002, new ArrayList<>(Arrays.asList(new MusicArtist("Paul McCartney", 38), new MusicArtist("Ringo Starr", 43)))));
        list.add(new MusicBand("Imagine Dragons", 2008, new ArrayList<>(Arrays.asList(new MusicArtist("Ryan Tedder", 32)))));
        list.add(new MusicBand("Coldplay", 1996, new ArrayList<>(Arrays.asList(new MusicArtist("Chris Martin", 29), new MusicArtist("Raymond Champion", 35)))));
        list.add(new MusicBand("One Direction", 2010, new ArrayList<>(Arrays.asList(new MusicArtist("Niall Horan", 30), new MusicArtist("Liam Payne", 50)))));
        list.add(new MusicBand("Radiohead", 1985, new ArrayList<>(Arrays.asList(new MusicArtist("Thom Yorke", 52)))));

        MusicBand.transferMembers(list.get(0), list.get(1));
        list.get(0).printMembers();
        list.get(1).printMembers();
    }
}
