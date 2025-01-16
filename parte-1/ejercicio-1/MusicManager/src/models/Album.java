package models;

public class Album {
    private String albumName;
    private int year;
    private Artist artist;

    Album(String albumName, int year, Artist artist) {
        this.albumName = albumName;
        this.year = year;
        this.artist = artist;
    }

    void showInfo() {
        System.out.println("El Artista " + this.artist + " Saco el albúm  " + this.albumName
                + " que salio en el año " + this.year);
    }

    // list<Album>
    void getAlbumByArtist(Artist artist) {

    }

    void getAlbumByYear(int year) {
    }

    void getAlbumByName(String name) {
    }

}
