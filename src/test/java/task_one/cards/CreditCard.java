package task_one.cards;


public class CreditCard extends BaseCard {

    int interestRate;
    int debtMaxLimit;

    @Override
    public void debit(int writeOffAmount) {
        if (balance >= 0) {
            super.debit(writeOffAmount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public int getDebt() {
        return debtMaxLimit;
    }

    public CreditCard(int interestRate, int debtMaxLimit) {
        this.interestRate = interestRate;
        this.debtMaxLimit = debtMaxLimit;
        this.balance = balance+debtMaxLimit;
    }
}
