package com.billing.invoice.po;

public class SystemInvoiceKey {
    private String invId;

    private String custId;

    private String currentMonth;

    private Short invVersion;

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId == null ? null : invId.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
    }

    public Short getInvVersion() {
        return invVersion;
    }

    public void setInvVersion(Short invVersion) {
        this.invVersion = invVersion;
    }
}