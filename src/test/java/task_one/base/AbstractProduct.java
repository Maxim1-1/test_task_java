package task_one.base;

public abstract class AbstractProduct {

    public String currency;
    public int balance;
    public String name ;

    public void replenishmentAmount(int amount) { balance=balance+amount;};

    public int getBalance() {return balance;};


}
