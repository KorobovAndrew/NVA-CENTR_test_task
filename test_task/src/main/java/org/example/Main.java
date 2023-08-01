package org.example;

import org.example.Products.*;

public class Main {
    public static void main(String[] args) {
        BankCard debitCard = new DebitCard(1000);
        System.out.println("your debit card information");
        debitCard.balanceInformation();
        debitCard.availableFundsInformation();
        System.out.println();

        BankCard creditCard = new CreditCard(10000, 1000);
        System.out.println("your credit card information");
        creditCard.balanceInformation();
        creditCard.availableFundsInformation();
        System.out.println();

        BankCard debitCashbackCard = new DebitCashbackCard(1000);
        System.out.println("your debit card information");
        debitCashbackCard.balanceInformation();
        debitCashbackCard.availableFundsInformation();
        System.out.println();

        BankCard creditTopUpBonusCard = new CreditTopUpBonusCard(10000, 1000);
        System.out.println("your debit card information");
        creditTopUpBonusCard.balanceInformation();
        creditTopUpBonusCard.availableFundsInformation();
    }
}