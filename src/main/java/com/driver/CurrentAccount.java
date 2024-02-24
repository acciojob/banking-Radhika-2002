package com.driver;

public class CurrentAccount extends BankAccount {
    String tradeLicenseId; // consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000); // minimum balance is 5000 by default
        this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        // Logic to validate or rearrange trade license ID
        // Not implemented in this example
        throw new Exception("Valid License can not be generated");
    }
}
