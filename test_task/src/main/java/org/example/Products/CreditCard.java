package org.example.Products;

public class CreditCard extends BankCard {
    protected final long creditLimit;
    protected long creditBalance;

    public CreditCard(long creditLimit, long balance) {
        super(balance);
        this.creditLimit = creditLimit;
        this.creditBalance = creditLimit;
    }

    @Override
    public void topUp(long amount) {
        creditBalance += amount;
        if (creditBalance > creditLimit) {
            super.topUp(creditBalance - creditLimit);
            creditBalance = creditLimit;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (balance + creditBalance < amount)
            return false;
        else if (balance >= amount)
            super.pay(amount);
        else {
            var payedFromCreditBalance = amount - balance;
            balance = 0;
            creditBalance -= payedFromCreditBalance;
        }
        return true;
    }

    @Override
    public void availableFundsInformation() {
        System.out.printf("available funds: %s\n" +
                        "available balance: %s\n" +
                        "available credit balance: %s\n" +
                        "credit limit: %s\n",
                        balance + creditBalance,
                        balance,
                        creditBalance,
                        creditLimit);
    }
}
