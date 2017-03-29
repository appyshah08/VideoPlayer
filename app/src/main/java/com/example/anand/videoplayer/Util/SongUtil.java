package com.example.anand.videoplayer.Util;

/**
 * Created by anand on 27/03/2017.
 */

public class SongUtil {
    private long id;
    private String title;
    private String artist;

    public SongUtil(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
