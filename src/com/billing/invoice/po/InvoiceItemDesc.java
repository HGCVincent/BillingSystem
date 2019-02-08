package com.billing.invoice.po;

import java.math.BigDecimal;
import java.util.Date;

public class InvoiceItemDesc {
    private Date actualEndDt;

    private Date actualStartDt;

    private Long amt;

    private Long amtCs;

    private Long amtUsd;

    private Long amtVdc;

    private String amtVerifyFlag;

    private String billPeriodFrom;

    private String billPeriodTo;

    private String currency;

    private String currentMonth;

    private String custId;

    private Long invDescId;

    private String invId;

    private BigDecimal invVersion;

    private String itemDesc;

    private String paymentItemCode;

    private Long price;

    public Date getActualEndDt() {
        return actualEndDt;
    }

    public void setActualEndDt(Date actualEndDt) {
        this.actualEndDt = actualEndDt;
    }

    public Date getActualStartDt() {
        return actualStartDt;
    }

    public void setActualStartDt(Date actualStartDt) {
        this.actualStartDt = actualStartDt;
    }

    public Long getAmt() {
        return amt;
    }

    public void setAmt(Long amt) {
        this.amt = amt;
    }

    public Long getAmtCs() {
        return amtCs;
    }

    public void setAmtCs(Long amtCs) {
        this.amtCs = amtCs;
    }

    public Long getAmtUsd() {
        return amtUsd;
    }

    public void setAmtUsd(Long amtUsd) {
        this.amtUsd = amtUsd;
    }

    public Long getAmtVdc() {
        return amtVdc;
    }

    public void setAmtVdc(Long amtVdc) {
        this.amtVdc = amtVdc;
    }

    public String getAmtVerifyFlag() {
        return amtVerifyFlag;
    }

    public void setAmtVerifyFlag(String amtVerifyFlag) {
        this.amtVerifyFlag = amtVerifyFlag == null ? null : amtVerifyFlag.trim();
    }

    public String getBillPeriodFrom() {
        return billPeriodFrom;
    }

    public void setBillPeriodFrom(String billPeriodFrom) {
        this.billPeriodFrom = billPeriodFrom == null ? null : billPeriodFrom.trim();
    }

    public String getBillPeriodTo() {
        return billPeriodTo;
    }

    public void setBillPeriodTo(String billPeriodTo) {
        this.billPeriodTo = billPeriodTo == null ? null : billPeriodTo.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public Long getInvDescId() {
        return invDescId;
    }

    public void setInvDescId(Long invDescId) {
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

    public String getPaymentItemCode() {
        return paymentItemCode;
    }

    public void setPaymentItemCode(String paymentItemCode) {
        this.paymentItemCode = paymentItemCode == null ? null : paymentItemCode.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}