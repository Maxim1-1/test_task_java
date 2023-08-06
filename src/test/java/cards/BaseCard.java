package cards;

import base.AbstractProduct;

public abstract class BaseCard extends AbstractProduct{

     protected void debit(int writeOffAmount) {balance=-writeOffAmount;};

}
