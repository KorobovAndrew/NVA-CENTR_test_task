package org.example.Products;

public final class DebitCashbackCard extends DebitCard{
    private final int cashbackPersent;
    public DebitCashbackCard(long balance) {
        super(balance);
        this.cashbackPersent = 10;
    }

    @Override
    public boolean pay(long amount) {
        if (amount >= balance)
            return false;
        balance += amount / cashbackPersent;
        return super.pay(amount);
    }
}
