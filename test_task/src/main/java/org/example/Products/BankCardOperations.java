package org.example.Products;

public interface BankCardOperations {
    public void topUp(long amount);
    public boolean pay(long amount);
    public void balanceInformation();
    public void availableFundsInformation();
}
