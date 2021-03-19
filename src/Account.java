public class Account {

    /* Design a class named Account that contains:
       A private int data field named id for the account (default 0).
       A private double data field named balance for the account (default 0).
       A private double data field named annualInterestRate that stores the current interest rate (default 0).
       Assume that all accounts have the same interest rate.
       A private Date data field named dateCreated that stores the date when the account was created.
       A no-arg constructor that creates a default account.
       A constructor that creates an account with the specified id and initial balance.
       The accessor and mutator methods for id, balance, and annualInterestRate.
       The accessor method for dateCreated.
       A method named getMonthlyInterestRate() that returns the monthly interest rate.
       A method named getMonthlyInterest() that returns the monthly interest.
       A method named withdraw that withdraws a specified amount from the account.
       A method named deposit that deposits a specified amount to the account.

       Draw the UML diagram for the class then implement the class. (Hint: The method getMonthlyInterest() is to return
       monthly interest, not the interest rate.
       Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12.
       Note annualInterestRate is a percentage, for example 4.5%. You need to divide it by 100.)
       Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an
       annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit
       $3,000, and print the balance, the monthly interest, and the date when this account was created.
     */


    // private data fields (default 0)
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    // A no-arg constructor that creates a default account
    Account(){}

    // constructor that creates an account with the specified id and initial balance
    Account(int specifiedId, double initialBalance){
        id = specifiedId;
        balance = initialBalance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }


    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    // // method named getMonthlyInterestRate() that returns the monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    // method named getMonthlyInterest() that returns the monthly interest rate
    public double getMonthlyInterest(){
        return (getMonthlyInterestRate() * balance);
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public void setId(int newId){
        id = newId;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    // method named withdraw that withdraws a specified amount from the account
    public void withdraw(double withdrawal){
        balance -= withdrawal;
    }

    // method named deposit that deposits a specified amount to the account
    public void deposit(double deposit){
        balance += deposit;
    }

    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf("The balance is $ %.2f\n", account.getBalance());
        System.out.printf("The monthly interest is $ %.2f\n", account.getMonthlyInterest());
        System.out.println("The account was created on " + account.getDateCreated());
    }
}
