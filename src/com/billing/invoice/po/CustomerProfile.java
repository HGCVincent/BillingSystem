package com.billing.invoice.po;

public class CustomerProfile {
    private String custId;

    private String custName;

    private String langType;

    private String country;

    private String county;

    private String city;

    private String adminName;

    private String adminTel;

    private String adminEmail;

    private String acctBdOwner;

    private String acctBdOwnerTel;

    private String acctBdOwnerEmail;

    private String addr1;

    private String addr2;

    private String addr3;

    private String addr4;

    private String invoiceTemplateCode;

    private String shortName;

    private Integer accountId;

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

    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType == null ? null : langType.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminTel() {
        return adminTel;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel == null ? null : adminTel.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public String getAcctBdOwner() {
        return acctBdOwner;
    }

    public void setAcctBdOwner(String acctBdOwner) {
        this.acctBdOwner = acctBdOwner == null ? null : acctBdOwner.trim();
    }

    public String getAcctBdOwnerTel() {
        return acctBdOwnerTel;
    }

    public void setAcctBdOwnerTel(String acctBdOwnerTel) {
        this.acctBdOwnerTel = acctBdOwnerTel == null ? null : acctBdOwnerTel.trim();
    }

    public String getAcctBdOwnerEmail() {
        return acctBdOwnerEmail;
    }

    public void setAcctBdOwnerEmail(String acctBdOwnerEmail) {
        this.acctBdOwnerEmail = acctBdOwnerEmail == null ? null : acctBdOwnerEmail.trim();
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1 == null ? null : addr1.trim();
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2 == null ? null : addr2.trim();
    }

    public String getAddr3() {
        return addr3;
    }

    public void setAddr3(String addr3) {
        this.addr3 = addr3 == null ? null : addr3.trim();
    }

    public String getAddr4() {
        return addr4;
    }

    public void setAddr4(String addr4) {
        this.addr4 = addr4 == null ? null : addr4.trim();
    }

    public String getInvoiceTemplateCode() {
        return invoiceTemplateCode;
    }

    public void setInvoiceTemplateCode(String invoiceTemplateCode) {
        this.invoiceTemplateCode = invoiceTemplateCode == null ? null : invoiceTemplateCode.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}