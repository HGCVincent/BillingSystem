package com.billing.invoice.po;

import java.math.BigDecimal;
import java.util.Date;

public class SystemInvoice extends SystemInvoiceKey {
    private String invRefNo;

    private String billComp;

    private String custName;

    private String invStatus;

    private String modifyBy;

    private Date modifyDt;

    private BigDecimal seqId;

    private String isLatestVer;

    private Date invSendOutDt;

    private Date invDueDt;

    private String attachmentName;

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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
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

    public BigDecimal getSeqId() {
        return seqId;
    }

    public void setSeqId(BigDecimal seqId) {
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
}