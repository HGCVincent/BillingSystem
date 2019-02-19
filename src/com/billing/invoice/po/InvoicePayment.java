package com.billing.invoice.po;

import java.util.Date;

public class InvoicePayment {
    private Integer paymentSeq;

    private String invRefNo;

    private String custId;

    private Float paymentAmt;

    private String paymentCurrency;

    private Date dateOfSettlement;

    private String settlementRemark;

    private String modifyBy;

    private Date modifyDate;

    private String status;

    private Date paymentDate;

    private String payer;

    private String payerAccount;

    private Integer version;

    private String isLatestVer;

    private Integer paymentId;

    private String currentMonth;

    private String billComp;

    private String custName;

    private String outstandingAmt;

    public Integer getPaymentSeq() {
        return paymentSeq;
    }

    public void setPaymentSeq(Integer paymentSeq) {
        this.paymentSeq = paymentSeq;
    }

    public String getInvRefNo() {
        return invRefNo;
    }

    public void setInvRefNo(String invRefNo) {
        this.invRefNo = invRefNo == null ? null : invRefNo.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public Float getPaymentAmt() {
        return paymentAmt;
    }

    public void setPaymentAmt(Float paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency == null ? null : paymentCurrency.trim();
    }

    public Date getDateOfSettlement() {
        return dateOfSettlement;
    }

    public void setDateOfSettlement(Date dateOfSettlement) {
        this.dateOfSettlement = dateOfSettlement;
    }

    public String getSettlementRemark() {
        return settlementRemark;
    }

    public void setSettlementRemark(String settlementRemark) {
        this.settlementRemark = settlementRemark == null ? null : settlementRemark.trim();
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount == null ? null : payerAccount.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getIsLatestVer() {
        return isLatestVer;
    }

    public void setIsLatestVer(String isLatestVer) {
        this.isLatestVer = isLatestVer == null ? null : isLatestVer.trim();
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
    }

    public String getBillComp() {
        return billComp;
    }

    public void setBillComp(String billComp) {
        this.billComp = billComp == null ? null : billComp.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getOutstandingAmt() {
        return outstandingAmt;
    }

    public void setOutstandingAmt(String outstandingAmt) {
        this.outstandingAmt = outstandingAmt == null ? null : outstandingAmt.trim();
    }
}