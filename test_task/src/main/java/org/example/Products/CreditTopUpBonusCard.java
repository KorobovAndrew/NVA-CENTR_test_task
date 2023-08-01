package org.example.Products;

public final class CreditTopUpBonusCard extends CreditCard{
    private final int topUpBonusPersent;
    public CreditTopUpBonusCard(long creditLimit, long balance) {
        super(creditLimit, balance);
        topUpBonusPersent = 5;
    }

    @Override
    public void topUp(long amount) {
        super.topUp(amount + amount * topUpBonusPersent / 100);
    }
}
