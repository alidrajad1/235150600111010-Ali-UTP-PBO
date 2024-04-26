package src;

public class Movie {
    private String title;
    private double rating = 1-10;
    private String[] genres;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie(String title, double rating, String[] genres) {
        this.title = title;
        this.rating = rating;
        this.genres = genres;
    }

    public  String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

}