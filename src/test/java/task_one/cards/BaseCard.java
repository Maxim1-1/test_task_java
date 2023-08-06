package task_one.cards;

import task_one.base.AbstractProduct;

public abstract class BaseCard extends AbstractProduct{

     public void debit(int writeOffAmount) {
          balance=balance-writeOffAmount;};

     public BaseCard() {
     }
}
