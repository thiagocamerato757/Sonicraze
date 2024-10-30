package Models
public class User{
    private String name;
    private String email;
    private String password;
    private boolean isArtist;
    private ArrayList<Music> musics;
    private ArrayList<Playlist> playlists;


    public User(String name, String email, String password, boolean isArtist){
        this.name = name;
        this.email = email;
        this.password = password;
        this.isArtist = isArtist;
        this.musics = new ArrayList<Music>();
        this.playlists = new ArrayList<Playlist>();
    }
}