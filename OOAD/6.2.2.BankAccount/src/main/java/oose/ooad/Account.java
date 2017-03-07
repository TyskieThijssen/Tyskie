package oose.ooad;

/**
 * Created by tyskie on 2/22/17.
 */
public abstract class Account {
    private Bank bank;
    private int accountno;
    private String customer;
    private double balance;

    public Account(Bank b, String cust){

    }

    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }

    public int getAccountno(){
        return accountno;
    }

}
