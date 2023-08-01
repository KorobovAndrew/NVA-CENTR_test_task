package org.example.Products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DebitCashbackCardTest {

    @Test
    public void payWithCashback(){
        var debitCashbackCard = new DebitCashbackCard(100);
        var expectedPaymentResult = true;
        var expectedBalance = 55;
        Assertions.assertEquals(expectedPaymentResult, debitCashbackCard.pay(50));
        Assertions.assertEquals(expectedBalance, debitCashbackCard.balance);
    }

    @Test
    public void payMoreThenBalance(){
        var debitCashbackCard = new DebitCashbackCard(100);
        var expectedPaymentResult = false;
        var expectedBalance = 100;
        Assertions.assertEquals(expectedPaymentResult, debitCashbackCard.pay(150));
        Assertions.assertEquals(expectedBalance, debitCashbackCard.balance);
    }
}