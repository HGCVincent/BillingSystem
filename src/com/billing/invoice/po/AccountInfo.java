package com.billing.invoice.po;

public class AccountInfo {
    private Long accountId;

    private String custName;

    private String taxInvName;

    private String bankAccount;

    private String isdefault;

    private String currency;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getTaxInvName() {
        return taxInvName;
    }

    public void setTaxInvName(String taxInvName) {
        this.taxInvName = taxInvName == null ? null : taxInvName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault == null ? null : isdefault.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }
}