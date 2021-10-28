package au.edu.unsw.infs3634.musicrecommender;

import java.io.Serializable;

/**
 * Represents a music item.
 */
public class Music implements Serializable {
    private String name;
    private String singer;
    private int rating;
    private String genre;
    private String description;
    private String url; //image url
    private int image; //image id of resource

    public Music(String url, String name, String singer, int rating, String genre, String description, int image) {
        this.url = url;
        this.name = name;
        this.singer = singer;
        this.rating = rating;
        this.genre = genre;
        this.description = description;
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public int getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
