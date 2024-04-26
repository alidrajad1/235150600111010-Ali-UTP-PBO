package src;

public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
    }

    public String getStudioInfo() {
        return type;
    }

    public int isBooked(char row, int col) {
        return col;

    }
    
    public boolean reserve(char row, int col) {
        return false;
    }
    
    public String getType() {
        return this.type;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {

    }
    
    private void setSeats() {
        
    }
}
