package models;
public class Playlist {
    private String name;
    private ArrayList<Music> musics;

    public Playlist(String name){
        this.name = name;
        this.musics = new ArrayList<Music>();
    }
}