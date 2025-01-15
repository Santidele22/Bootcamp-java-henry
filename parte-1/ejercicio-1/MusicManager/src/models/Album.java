package models;

public class Album {
    private String name;
    private int date;
    private Artist artist = new Artist();

    Album(String name, int date, Artist artist) {
        this.name = name;
        this.date = date;
        this.artist = artist;
    }

    void showInfo() {
        System.out.println("El Artista " + this.artist + " Saco el albúm  " + this.name
                + " que salio en el año " + this.date);
    }
}
