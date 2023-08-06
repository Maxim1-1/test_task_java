package task_one.cards;

import task_one.base.AbstractProduct;

public abstract class BaseCard extends AbstractProduct{

     protected void debit(int writeOffAmount) {balance=-writeOffAmount;};

}
