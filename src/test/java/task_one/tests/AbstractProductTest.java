package task_one.tests;

import org.junit.Assert;
import org.junit.Test;
import task_one.cards.CreditCard;
import task_one.cards.CurrencyDebitCard;
import task_one.cards.DebitCard;

import java.util.Random;

public class AbstractProductTest {
    Random randomValue = new Random();
    int amount = randomValue.nextInt(100);

    @Test
    public void replenishmentAmountDebitTest() {

        DebitCard debitCard = new DebitCard();
        debitCard.replenishmentAmount(amount);

        Assert.assertEquals(amount, debitCard.getBalance());
    }

    @Test
    public void replenishmentAmountCreditTest() {

        CreditCard creditCard = new CreditCard(3,100);

        creditCard.replenishmentAmount(amount);

        Assert.assertEquals(amount+100, creditCard.getBalance());
    }

    @Test
    public void replenishmentAmountCurrencyDebitCardTest() {

        CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard();
        currencyDebitCard.replenishmentAmount(amount);

        Assert.assertEquals(amount, currencyDebitCard.getBalance());
    }

}
