package task_one.contribution;

import task_one.base.AbstractProduct;


public class Contribution extends AbstractProduct {

    @Override
    protected void replenishmentAmount(int amount) {
        super.replenishmentAmount(amount);
    }

    @Override
    protected int getBalance() {
        return super.getBalance();
    }

    protected void closeDeposit() {System.out.println("Депозит закрыт");};
}
