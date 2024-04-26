package src;

public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketList;
    private static int MAXTICKET = 20;

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

    public boolean addTicket(Ticket ticket) {
        return ticket == null;
    }

    public void displayAllicket() {

    }
    
    public boolean isMatch(String email, String password) {
        if (email == this.email && password == this.password) {
            return true;
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFullName() {
        return this.fullName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        
    }

   
}
