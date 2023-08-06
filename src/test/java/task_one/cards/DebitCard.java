package task_one.cards;


public class DebitCard extends BaseCard {
    @Override
    public void debit(int writeOffAmount) {
        if (balance >= writeOffAmount) {
            super.debit(writeOffAmount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
