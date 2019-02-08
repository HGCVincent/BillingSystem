package com.billing.invoice.po;

import java.util.Date;
import java.util.List;

public class SystemInvoice {
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
    
    private List<InvoiceItemDesc> invoiceItemDescs;

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId == null ? null : invId.trim();
    }

    public String getInvRefNo() {
        return invRefNo;
    }

    public void setInvRefNo(String invRefNo) {
        this.invRefNo = invRefNo == null ? null : invRefNo.trim();
    }

    public String getBillComp() {
        return billComp;
    }

    public void setBillComp(String billComp) {
        this.billComp = billComp == null ? null : billComp.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
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
        this.invStatus = invStatus == null ? null : invStatus.trim();
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
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
        this.isLatestVer = isLatestVer == null ? null : isLatestVer.trim();
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
        this.attachmentName = attachmentName == null ? null : attachmentName.trim();
    }

    public Date getInvDt() {
        return invDt;
    }

    public void setInvDt(Date invDt) {
        this.invDt = invDt;
    }

	public List<InvoiceItemDesc> getInvoiceItemDescs() {
		return invoiceItemDescs;
	}

	public void setInvoiceItemDescs(List<InvoiceItemDesc> invoiceItemDescs) {
		this.invoiceItemDescs = invoiceItemDescs;
	}

	@Override
	public String toString() {
		return "SystemInvoice [invId=" + invId + ", invRefNo=" + invRefNo + ", billComp=" + billComp + ", custId="
				+ custId + ", custName=" + custName + ", currentMonth=" + currentMonth + ", invVersion=" + invVersion
				+ ", invStatus=" + invStatus + ", modifyBy=" + modifyBy + ", modifyDt=" + modifyDt + ", seqId=" + seqId
				+ ", isLatestVer=" + isLatestVer + ", invSendOutDt=" + invSendOutDt + ", invDueDt=" + invDueDt
				+ ", attachmentName=" + attachmentName + ", invDt=" + invDt + ", invoiceItemDescs=" + invoiceItemDescs
				+ "]";
	}
    
    
}