package src;

public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
    }

    private void init() {

    }
    
    public boolean registerUser(User user) {
        return user == null;
    }
    
    public User authenticateUSer(String email, String PassWord) {
        return authenticateUSer(email, PassWord);
    }

    public void displayStudioDetail(int studioNumber) {

    }
    
    public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres) {
        return true;
    }
    
    public boolean bookTicket(User user, int StudioNumber, char row, int col) {
        return true;
    }

    public String getname() {
        return this.name;
    }
}
