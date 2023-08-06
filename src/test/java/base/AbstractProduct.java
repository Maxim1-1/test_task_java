package base;

public abstract class AbstractProduct {

    protected String currency;
    protected int balance;
    protected String name ;

    protected void replenishmentAmount(int amount) { balance+=amount;};

    protected int getBalance() {return balance;};


}
