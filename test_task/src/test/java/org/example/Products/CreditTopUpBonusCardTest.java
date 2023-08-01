package org.example.Products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditTopUpBonusCardTest {

    @Test
    public void topUpBalance(){
        var creditTopUpBonusCard = new CreditTopUpBonusCard(200, 100);
        var expectedBalance = 205;
        var expectedCreditBalance = 200;
        creditTopUpBonusCard.topUp(100);
        Assertions.assertEquals(expectedBalance, creditTopUpBonusCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditTopUpBonusCard.creditBalance);
    }

    @Test
    public void topUpCreditBalance(){
        var creditTopUpBonusCard = new CreditTopUpBonusCard(200, 100);
        creditTopUpBonusCard.pay(250);
        creditTopUpBonusCard.topUp(100);
        var expectedBalance = 0;
        var expectedCreditBalance = 155;
        Assertions.assertEquals(expectedBalance, creditTopUpBonusCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditTopUpBonusCard.creditBalance);
    }
}