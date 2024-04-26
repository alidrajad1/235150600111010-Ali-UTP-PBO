package src;

public class Ticket {
    private Movie movie;
    private int studioNumber;
    private static  double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }

    public String getTicketInfo() {
        return seat;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setStudioNumber(int studioNumber) {
        this.studioNumber = studioNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public static double getTicketPrice(String type) {
        if(type == "Premiere"){
            return 12000;
        }else if(type == "Imax"){
            return 10000;
        } else if (type == "Reguler") {
            return 50000;
        } else {
            System.out.println("?");
        }
        return price;
    }

}
