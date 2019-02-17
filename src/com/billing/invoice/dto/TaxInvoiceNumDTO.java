package com.billing.invoice.dto;

import java.util.Date;

import com.billing.invoice.po.TaxInvoiceNum;

public class TaxInvoiceNumDTO {
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
    
    private String remainNum;

	public TaxInvoiceNumDTO() {
		super();
	}
	
	public void convertTaxNumToTaxNumDto(TaxInvoiceNumDTO taxInvoiceNumDTO,TaxInvoiceNum taxInvoiceNum) {
		taxInvoiceNumDTO.setInvId(taxInvoiceNum.getInvId());
		taxInvoiceNumDTO.setTaxInvType(taxInvoiceNum.getTaxInvType());
		taxInvoiceNumDTO.setOffice(taxInvoiceNum.getOffice());
		taxInvoiceNumDTO.setCurrency(taxInvoiceNum.getCurrency());
		taxInvoiceNumDTO.setPaymentCurrency(taxInvoiceNum.getPaymentCurrency());
		taxInvoiceNumDTO.setCreateBy(taxInvoiceNum.getCreateBy());
		taxInvoiceNumDTO.setModifyDate(taxInvoiceNum.getModifyDate());
		taxInvoiceNumDTO.setAssignTo(taxInvoiceNum.getAssignTo());
		taxInvoiceNumDTO.setInvIdStatus(taxInvoiceNum.getInvIdStatus());
		taxInvoiceNumDTO.setIsUsed(taxInvoiceNum.getIsUsed());
		taxInvoiceNumDTO.setRemarks(taxInvoiceNum.getRemarks());
		taxInvoiceNumDTO.setSeqId(taxInvoiceNum.getSeqId());
		taxInvoiceNumDTO.setTaxInvBatch(taxInvoiceNum.getTaxInvBatch());
		taxInvoiceNumDTO.setTaxDate(taxInvoiceNum.getTaxDate());
		taxInvoiceNumDTO.setTaxFrom(taxInvoiceNum.getTaxFrom());
		taxInvoiceNumDTO.setTaxTo(taxInvoiceNum.getTaxTo());
		taxInvoiceNumDTO.setIsRepeat(taxInvoiceNum.getIsRepeat());
	}

	public String getRemainNum() {
		return remainNum;
	}

	public void setRemainNum(String remainNum) {
		this.remainNum = remainNum;
	}

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
		this.taxInvType = taxInvType;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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
		this.assignTo = assignTo;
	}

	public String getInvIdStatus() {
		return invIdStatus;
	}

	public void setInvIdStatus(String invIdStatus) {
		this.invIdStatus = invIdStatus;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		this.isRepeat = isRepeat;
	}
    
    
}
