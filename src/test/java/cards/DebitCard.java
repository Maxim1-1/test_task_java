package cards;


public class DebitCard extends BaseCard {
    @Override
    protected void debit(int writeOffAmount) {
        if (balance >= writeOffAmount) {
            super.debit(writeOffAmount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
