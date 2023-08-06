package task_one.cards;


public class CreditCard extends DebitCard {

    int interestRate;
    int maxLimit;

    @Override
    protected void debit(int writeOffAmount) {
        if (balance + maxLimit >= writeOffAmount) {
            super.debit(writeOffAmount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public int getInterestRate() {
        if (balance < 0) {
            return balance;
        }
        return 0;
    }

    public CreditCard(int interestRate, int maxLimit) {
        this.interestRate = interestRate;
        this.maxLimit = maxLimit;
    }
}
