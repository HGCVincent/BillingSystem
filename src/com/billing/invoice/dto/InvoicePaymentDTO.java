package com.billing.invoice.dto;

import java.util.Date;

import com.billing.invoice.po.InvoicePayment;
import com.billing.invoice.po.SystemInvoice;

public class InvoicePaymentDTO {
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
    
    private Date invoiceDate;
    
    private Float invoiceAmt;
    
    private String invoiceCurrency;

	public InvoicePaymentDTO() {
		super();
	}
	
	public void convertInvoicePaymentToInvoicePaymentDTO(InvoicePaymentDTO invoicePaymentDto,
			    InvoicePayment invoicePayment,SystemInvoice systemInvoice){
		invoicePaymentDto.setPaymentSeq(invoicePayment.getPaymentSeq());
        invoicePaymentDto.setCustId(invoicePayment.getCustId());
        invoicePaymentDto.setCustName(systemInvoice.getCustName());
        invoicePaymentDto.setInvRefNo(invoicePayment.getInvRefNo());
        invoicePaymentDto.setBillComp(invoicePayment.getBillComp());
        invoicePaymentDto.setInvoiceDate(systemInvoice.getInvDt());
        invoicePaymentDto.setDateOfSettlement(invoicePayment.getDateOfSettlement());
        invoicePaymentDto.setSettlementRemark(invoicePayment.getSettlementRemark());
        invoicePaymentDto.setCurrentMonth(invoicePayment.getCurrentMonth());
        invoicePaymentDto.setModifyBy(invoicePayment.getModifyBy());
        invoicePaymentDto.setModifyDate(invoicePayment.getModifyDate());
        invoicePaymentDto.setStatus(invoicePayment.getStatus());
        invoicePaymentDto.setPaymentDate(invoicePayment.getPaymentDate());
        invoicePaymentDto.setPayer(invoicePayment.getPayer());
        invoicePaymentDto.setPayerAccount(invoicePayment.getPayerAccount());
        invoicePaymentDto.setPaymentId(invoicePayment.getPaymentId());
        invoicePaymentDto.setOutstandingAmt(invoicePayment.getOutstandingAmt());
	}

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
		this.invRefNo = invRefNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
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
		this.paymentCurrency = paymentCurrency;
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
		this.settlementRemark = settlementRemark;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
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
		this.status = status;
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
		this.payer = payer;
	}

	public String getPayerAccount() {
		return payerAccount;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
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
		this.isLatestVer = isLatestVer;
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
		this.currentMonth = currentMonth;
	}

	public String getBillComp() {
		return billComp;
	}

	public void setBillComp(String billComp) {
		this.billComp = billComp;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getOutstandingAmt() {
		return outstandingAmt;
	}

	public void setOutstandingAmt(String outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Float getInvoiceAmt() {
		return invoiceAmt;
	}

	public void setInvoiceAmt(Float invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceCurrency() {
		return invoiceCurrency;
	}

	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}
    
	
    
}
