package org.example.Products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DebitCardTest {

    @Test
    public void topUp(){
        var debitCard = new DebitCard(10);
        var expectedBalance = 15;
        debitCard.topUp(5);
        Assertions.assertEquals(expectedBalance, debitCard.balance);
    }

    @Test
    public void payLessThenBalance(){
        var debitCard = new DebitCard(10);
        var expectedPaymentResult = true;
        var expectedBalance = 5;
        Assertions.assertEquals(expectedPaymentResult, debitCard.pay(5));
        Assertions.assertEquals(expectedBalance, debitCard.balance);
    }

    @Test
    public void payMoreThenBalance(){
        var debitCard = new DebitCard(10);
        var expectedPaymentResult = false;
        var expectedBalance = 10;
        Assertions.assertEquals(expectedPaymentResult, debitCard.pay(15));
        Assertions.assertEquals(expectedBalance, debitCard.balance);
    }
}