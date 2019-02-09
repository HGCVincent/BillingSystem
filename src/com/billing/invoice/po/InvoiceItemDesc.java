package com.billing.invoice.po;

import java.util.Date;

public class InvoiceItemDesc {
    private Long invDescId;

    private String invoiceId;

    private String customerId;

    private String itemDesc;

    private String itemCurrency;

    private Long price;

    private Long itemAmt;

    private String itemCurrentMonth;

    private String billPeriodFrom;

    private String billPeriodTo;

    private Integer invVersion;

    private Date actualEndDt;

    private Date actualStartDt;

    private Long amtCs;

    private Long amtUsd;

    private Long amtVdc;

    private String amtVerifyFlag;

    private String paymentItemCode;

    public Long getInvDescId() {
        return invDescId;
    }

    public void setInvDescId(Long invDescId) {
        this.invDescId = invDescId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId == null ? null : invoiceId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    public String getItemCurrency() {
        return itemCurrency;
    }

    public void setItemCurrency(String itemCurrency) {
        this.itemCurrency = itemCurrency == null ? null : itemCurrency.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getItemAmt() {
        return itemAmt;
    }

    public void setItemAmt(Long itemAmt) {
        this.itemAmt = itemAmt;
    }

    public String getItemCurrentMonth() {
        return itemCurrentMonth;
    }

    public void setItemCurrentMonth(String itemCurrentMonth) {
        this.itemCurrentMonth = itemCurrentMonth == null ? null : itemCurrentMonth.trim();
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

    public Integer getInvVersion() {
        return invVersion;
    }

    public void setInvVersion(Integer invVersion) {
        this.invVersion = invVersion;
    }

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

    public String getPaymentItemCode() {
        return paymentItemCode;
    }

    public void setPaymentItemCode(String paymentItemCode) {
        this.paymentItemCode = paymentItemCode == null ? null : paymentItemCode.trim();
    }
}