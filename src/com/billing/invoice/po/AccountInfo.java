package com.billing.invoice.po;

import java.math.BigDecimal;

public class AccountInfo {
    private BigDecimal accountId;

    private String custName;

    private String taxInvName;

    public BigDecimal getAccountId() {
        return accountId;
    }

    public void setAccountId(BigDecimal accountId) {
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
}