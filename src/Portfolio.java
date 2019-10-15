/*
 * CSC 478 Capstone
 * HedgeFundHackers
 * Porfolio class
 */

public class Portfolio{
//Declare instance variables here
    private String name = "";
    private double balance = 0.0;
    Stock s = new Stock();
    ArrayList<Stock> stockList = new ArrayList<Stock>();

    //Default constructor for the User class with attributes of a User Object
    public Portfolio(String name, double balance){
        //create attributes for Portfolio
        super();
        this.name = name;
        this.balance = balance;
    }//constructor

//Methods to save and load portfolio file
    public savePortfolio(){
        //TODO
    }
    public loadPortfolio(){
        //TODO
    }

//Methods to add and remove stock from stockList
    public addStock(){
        //TODO
    }
    public removeStock(){
        //TODO
    }

//Accessors and mutators for Portfolio object traits
    //NAME ATTRIBUTE
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //BALANCE ATTRIBUTE
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
