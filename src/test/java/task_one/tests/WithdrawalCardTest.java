package task_one.tests;

import org.junit.Assert;
import org.junit.Test;
import task_one.cards.CreditCard;
import task_one.cards.CurrencyDebitCard;
import task_one.cards.DebitCard;

import java.util.Random;

public class WithdrawalCardTest {

    Random randomValue = new Random();
    int amount = randomValue.nextInt(100);


    @Test
    public void withdrawalDebitCard() {

        DebitCard debitCard = new DebitCard();

        debitCard.replenishmentAmount(amount);
        debitCard.debit(amount);

        Assert.assertEquals(0, debitCard.getBalance());

    }

    @Test
    public void withdrawalCreditCard() {

        CreditCard creditCard = new CreditCard(3,100);

        creditCard.replenishmentAmount(amount);
        creditCard.debit(amount+100);

        Assert.assertEquals(0, creditCard.getBalance());

    }

    @Test
    public void withdrawalCurrencyDebitCardCard() {

        CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard();

        currencyDebitCard.replenishmentAmount(amount);
        currencyDebitCard.debit(amount);

        Assert.assertEquals(0, currencyDebitCard.getBalance());

    }

}
