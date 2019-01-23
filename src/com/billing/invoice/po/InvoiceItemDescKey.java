package com.billing.invoice.po;

import java.math.BigDecimal;

public class InvoiceItemDescKey {
    private String custId;

    private BigDecimal invDescId;

    private String invId;

    private BigDecimal invVersion;

    private String itemDesc;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public BigDecimal getInvDescId() {
        return invDescId;
    }

    public void setInvDescId(BigDecimal invDescId) {
        this.invDescId = invDescId;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId == null ? null : invId.trim();
    }

    public BigDecimal getInvVersion() {
        return invVersion;
    }

    public void setInvVersion(BigDecimal invVersion) {
        this.invVersion = invVersion;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}