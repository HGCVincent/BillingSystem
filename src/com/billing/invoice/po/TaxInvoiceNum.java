package com.billing.invoice.po;

import java.util.Date;

public class TaxInvoiceNum {
    private Long invId;

    private String taxInvType;

    private String office;

    private String currency;

    private String paymentCurrency;

    private String createBy;

    private Date modifyDate;

    private String assignTo;

    private String invIdStatus;

    private String isUsed;

    private String remarks;

    private Integer seqId;

    private Integer taxInvBatch;

    private Date taxDate;

    private Integer taxFrom;

    private Integer taxTo;

    private String isRepeat;

    public Long getInvId() {
        return invId;
    }

    public void setInvId(Long invId) {
        this.invId = invId;
    }

    public String getTaxInvType() {
        return taxInvType;
    }

    public void setTaxInvType(String taxInvType) {
        this.taxInvType = taxInvType == null ? null : taxInvType.trim();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency == null ? null : paymentCurrency.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(String assignTo) {
        this.assignTo = assignTo == null ? null : assignTo.trim();
    }

    public String getInvIdStatus() {
        return invIdStatus;
    }

    public void setInvIdStatus(String invIdStatus) {
        this.invIdStatus = invIdStatus == null ? null : invIdStatus.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public Integer getTaxInvBatch() {
        return taxInvBatch;
    }

    public void setTaxInvBatch(Integer taxInvBatch) {
        this.taxInvBatch = taxInvBatch;
    }

    public Date getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    public Integer getTaxFrom() {
        return taxFrom;
    }

    public void setTaxFrom(Integer taxFrom) {
        this.taxFrom = taxFrom;
    }

    public Integer getTaxTo() {
        return taxTo;
    }

    public void setTaxTo(Integer taxTo) {
        this.taxTo = taxTo;
    }

    public String getIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(String isRepeat) {
        this.isRepeat = isRepeat == null ? null : isRepeat.trim();
    }
}