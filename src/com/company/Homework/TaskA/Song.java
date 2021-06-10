package com.company.Homework.TaskA;

public class Song {
    private String Name, Singer, Genre, Lyrics;

    public Song(String name, String singer, String genre, String lyrics) {
        Name = name;
        Singer = singer;
        Genre = genre;
        Lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "Name = " + Name +
                "Singer = " + Singer +
                "Genre = " + Genre +
                "Lyrics = " + Lyrics;
    }
}
