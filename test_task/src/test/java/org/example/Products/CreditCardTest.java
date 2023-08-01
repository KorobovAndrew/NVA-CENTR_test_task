package org.example.Products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditCardTest {

    @Test
    public void creditBalanceAfterCreation(){
        var creditCard = new CreditCard(20, 10);
        var expectedCreditBalance = 20;
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }

    @Test
    public void topUpBalance(){
        var creditCard = new CreditCard(20, 10);
        var expectedBalance = 15;
        var expectedCreditBalance = 20;
        creditCard.topUp(5);
        Assertions.assertEquals(expectedBalance, creditCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }

    @Test
    public void topUpCreditBalance(){
        var creditCard = new CreditCard(20, 10);
        creditCard.pay(25);
        creditCard.topUp(5);
        var expectedBalance = 0;
        var expectedCreditBalance = 10;
        Assertions.assertEquals(expectedBalance, creditCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }

    @Test
    public void topUpBalanceAfterFillingCreditBalance(){
        var creditCard = new CreditCard(20, 10);
        creditCard.pay(25);
        creditCard.topUp(50);
        var expectedBalance = 35;
        var expectedCreditBalance = 20;
        Assertions.assertEquals(expectedBalance, creditCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }

    @Test
    void payFromBalance() {
        var creditCard = new CreditCard(20, 10);
        creditCard.pay(5);
        var expectedBalance = 5;
        var expectedCreditBalance = 20;
        Assertions.assertEquals(expectedBalance, creditCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }

    @Test
    void payFromCreditBalance() {
        var creditCard = new CreditCard(20, 10);
        var expectedPaymentResult = true;
        var expectedBalance = 0;
        var expectedCreditBalance = 5;
        Assertions.assertEquals(expectedPaymentResult, creditCard.pay(25));
        Assertions.assertEquals(expectedBalance, creditCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }

    @Test
    void payMoreThenAvailableFunds() {
        var creditCard = new CreditCard(20, 10);
        var expectedPaymentResult = false;
        var expectedBalance = 10;
        var expectedCreditBalance = 20;
        Assertions.assertEquals(expectedPaymentResult, creditCard.pay(50));
        Assertions.assertEquals(expectedBalance, creditCard.balance);
        Assertions.assertEquals(expectedCreditBalance, creditCard.creditBalance);
    }
}