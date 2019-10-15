/*
 * CSC 478 Capstone
 * HedgeFundHackers
 * User class
 */

public class User {
//Declare instance variables here
    private String username = "";
    private double bankBalance = 0.0;
    private int counter = 0;
    Portfolio pf = new Portfolio();

    //Default constructor for the User class with attributes of a User Object
    public User(String username, double bankBalance){
        //create attributes for User
        super();
        this.username = username;
        this.bankBalance = bankBalance;
    }//constructor

//Methods for buying and selling stock
    public buyStock(){
        //TODO
    }
    public sellStock(){
        //TODO
    }


//Accessors and mutators for User object traits
    //USERNAME ATTRIBUTE
    public String getUsername() {
        return username;
    }//accessor for username
    public void setUsername(String username) {
        this.username = username;
    }//mutator for username

    //BANK BALANCE ATTRIBUTE
    public double getBankBalance() {
        return bankBalance;
    }//accessor for bank balance
    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }//mutator for bank balance
}