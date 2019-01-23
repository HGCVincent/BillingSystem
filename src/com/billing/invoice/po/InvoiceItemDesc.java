package com.billing.invoice.po;

import java.math.BigDecimal;
import java.util.Date;

public class InvoiceItemDesc extends InvoiceItemDescKey {
    private Date actualEndDt;

    private Date actualStartDt;

    private Integer amt;

    private Integer amtCs;

    private Integer amtUsd;

    private Integer amtVdc;

    private String amtVerifyFlag;

    private String billPeriodFrom;

    private String billPeriodTo;

    private String currency;

    private String currentMonth;

    private String paymentItemCode;

    private BigDecimal price;

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

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    public Integer getAmtCs() {
        return amtCs;
    }

    public void setAmtCs(Integer amtCs) {
        this.amtCs = amtCs;
    }

    public Integer getAmtUsd() {
        return amtUsd;
    }

    public void setAmtUsd(Integer amtUsd) {
        this.amtUsd = amtUsd;
    }

    public Integer getAmtVdc() {
        return amtVdc;
    }

    public void setAmtVdc(Integer amtVdc) {
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

    public String getPaymentItemCode() {
        return paymentItemCode;
    }

    public void setPaymentItemCode(String paymentItemCode) {
        this.paymentItemCode = paymentItemCode == null ? null : paymentItemCode.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}