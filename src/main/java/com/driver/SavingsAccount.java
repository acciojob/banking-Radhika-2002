package com.driver;

public class SavingsAccount extends BankAccount {
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name, balance, 0); // minimum balance is 0 by default
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > maxWithdrawalLimit) {
            throw new Exception("Maximum Withdraw Limit Exceed");
        } else if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }

    public double getSimpleInterest(int years) {
        // Logic to calculate simple interest
        // Not implemented in this example
        return 0;
    }

    public double getCompoundInterest(int times, int years) {
        // Logic to calculate compound interest
        // Not implemented in this example
        return 0;
    }
}
