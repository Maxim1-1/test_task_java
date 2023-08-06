package task_one.contribution;

import task_one.base.AbstractProduct;


public class Contribution extends AbstractProduct {

    @Override
    public void replenishmentAmount(int amount) {
        super.replenishmentAmount(amount);
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }

    protected void closeDeposit() {System.out.println("Депозит закрыт");};
}

