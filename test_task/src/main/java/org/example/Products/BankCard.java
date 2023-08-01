package org.example.Products;

public abstract class BankCard implements BankCardOperations{
    protected long balance;

    public BankCard(long balance) {
        this.balance = balance;
    }

    @Override
    public void topUp(long amount) {
        balance += amount;
    }

    @Override
    public boolean pay(long amount) {
        if(amount > balance)
            return false;
        balance -= amount;
        return true;
    }

    @Override
    public void balanceInformation() {
        System.out.printf("actual balance: %s\n", balance);
    }

    @Override
    public void availableFundsInformation() {
        System.out.printf("available funds: %s\n", balance);
    }
}
