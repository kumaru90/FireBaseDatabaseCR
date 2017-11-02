package com.example.firebasedatabasecr;

/**
 * Created by student6 on 11/2/17.
 */

public class Artist {

    String artistId;
    String artistName;


    public Artist() {

    }

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}