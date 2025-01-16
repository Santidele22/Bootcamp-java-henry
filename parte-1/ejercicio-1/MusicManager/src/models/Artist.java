package models;

import java.util.List;

public class Artist extends Person {
    private List<Album> albums;
    private Manager manager;

    Artist(String name, int age) {
        super(name, age);
    }

    List<Album> getAlbums() {
        return albums;
    }

    void addAlbum(String albumName, int year) {
        Album newAlbum = new Album(albumName, year, getName());
        albums.add(newAlbum);
    }
}
