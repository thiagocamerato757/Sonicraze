package models;
public class Music {
    private String name;
    private String artist;
    private String genre;
    private String path;
    private String cover;
    private String lyrics;
    private int year;
    private int duration;

    public Music(String name, String artist, String genre, String path, String lyrics, String cover, int year, int duration){
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.path = path;
        this.cover = cover;
        this.lyrics = lyrics;
        this.year = year;
        this.duration = duration;
    }
}