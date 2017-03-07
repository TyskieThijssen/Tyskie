package oose.ooad;

/**
 * Created by tyskie on 2/22/17.
 */
public class CurrentAccount extends Account {
    private double creditLimit;

    public CurrentAccount(Bank b, String cust, double credLim) {
        super(b, cust);
        this.creditLimit = credLim;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(double credLim){
        this.creditLimit = credLim;
    }

    @Override
    public void withdraw(double amount){

    }
}
