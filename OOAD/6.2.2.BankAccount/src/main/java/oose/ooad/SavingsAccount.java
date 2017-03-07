package oose.ooad;

/**
 * Created by tyskie on 2/22/17.
 */
public class SavingsAccount extends Account {
    private double interestPerc;

    public SavingsAccount(Bank b, String cust, double perc) {
        super(b, cust);
        this.interestPerc = perc;
    }

    public void addInterest(){

    }

    public double getInterestPerc(){
        return interestPerc;
    }

    public void setInterestPerc(double perc){
        this.interestPerc = perc;
    }

    @Override
    public void withdraw(double amount){

    }
}
