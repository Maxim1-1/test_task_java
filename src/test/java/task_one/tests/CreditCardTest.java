package task_one.tests;

import org.junit.Assert;
import org.junit.Test;
import task_one.cards.CreditCard;


import java.util.Random;

public class CreditCardTest {

    Random randomValue = new Random();
    int amount = randomValue.nextInt(100);

    @Test
    public void getDebtDebitCard() {

        CreditCard creditCard = new CreditCard(1,amount);

        Assert.assertEquals(amount, creditCard.getDebt());

    }
}
