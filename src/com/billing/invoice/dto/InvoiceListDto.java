package com.billing.invoice.dto;

import java.util.Date;
import java.util.List;

import com.billing.invoice.po.SystemInvoice;

public class InvoiceListDto {
	private String invId;

    private String invRefNo;

    private String billComp;

    private String custId;

    private String custName;

    private String currentMonth;

    private Integer invVersion;

    private String invStatus;

    private String modifyBy;

    private Date modifyDt;

    private Integer seqId;

    private String isLatestVer;

    private Date invSendOutDt;

    private Date invDueDt;

    private String attachmentName;
    
    private Date invDt;
    
   
	public InvoiceListDto() {
		super();
	}

	public InvoiceListDto(SystemInvoice selectByExample) {
		this.setInvId(selectByExample.getInvId());
		this.setInvRefNo(selectByExample.getInvRefNo());
		this.setBillComp(selectByExample.getBillComp());
		this.setCustId(selectByExample.getCustId());
		this.setCustName(selectByExample.getCustName());
		this.setCurrentMonth(selectByExample.getCurrentMonth());
		this.setInvVersion(selectByExample.getInvVersion());
		this.setInvStatus(selectByExample.getInvStatus());
		this.setModifyBy(selectByExample.getModifyBy());
		this.setModifyDt(selectByExample.getModifyDt());
		this.setSeqId(selectByExample.getSeqId());
		this.setIsLatestVer(selectByExample.getIsLatestVer());
		this.setInvSendOutDt(selectByExample.getInvSendOutDt());
		this.setInvDueDt(selectByExample.getInvDueDt());
		this.setAttachmentName(selectByExample.getAttachmentName());
		this.setInvDt(selectByExample.getInvDt());
	}

	public String getInvId() {
		return invId;
	}

	public void setInvId(String invId) {
		this.invId = invId;
	}

	public String getInvRefNo() {
		return invRefNo;
	}

	public void setInvRefNo(String invRefNo) {
		this.invRefNo = invRefNo;
	}

	public String getBillComp() {
		return billComp;
	}

	public void setBillComp(String billComp) {
		this.billComp = billComp;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCurrentMonth() {
		return currentMonth;
	}

	public void setCurrentMonth(String currentMonth) {
		this.currentMonth = currentMonth;
	}

	public Integer getInvVersion() {
		return invVersion;
	}

	public void setInvVersion(Integer invVersion) {
		this.invVersion = invVersion;
	}

	public String getInvStatus() {
		return invStatus;
	}

	public void setInvStatus(String invStatus) {
		this.invStatus = invStatus;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDt() {
		return modifyDt;
	}

	public void setModifyDt(Date modifyDt) {
		this.modifyDt = modifyDt;
	}

	public Integer getSeqId() {
		return seqId;
	}

	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}

	public String getIsLatestVer() {
		return isLatestVer;
	}

	public void setIsLatestVer(String isLatestVer) {
		this.isLatestVer = isLatestVer;
	}

	public Date getInvSendOutDt() {
		return invSendOutDt;
	}

	public void setInvSendOutDt(Date invSendOutDt) {
		this.invSendOutDt = invSendOutDt;
	}

	public Date getInvDueDt() {
		return invDueDt;
	}

	public void setInvDueDt(Date invDueDt) {
		this.invDueDt = invDueDt;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public Date getInvDt() {
		return invDt;
	}

	public void setInvDt(Date invDt) {
		this.invDt = invDt;
	}

	
	
}
