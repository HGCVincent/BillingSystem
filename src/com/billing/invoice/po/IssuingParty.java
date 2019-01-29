package com.billing.invoice.po;

public class IssuingParty {
    private String partyName;

    private String address;

    private String partyTel;

    private String currency;

    private String bankAccount;

    private String bankName;

    private Integer partyId;

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName == null ? null : partyName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPartyTel() {
        return partyTel;
    }

    public void setPartyTel(String partyTel) {
        this.partyTel = partyTel == null ? null : partyTel.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

	public IssuingParty() {
		super();
	}

	public IssuingParty(String partyName, String address, String partyTel, String currency, String bankAccount,
			String bankName, Integer partyId) {
		super();
		this.partyName = partyName;
		this.address = address;
		this.partyTel = partyTel;
		this.currency = currency;
		this.bankAccount = bankAccount;
		this.bankName = bankName;
		this.partyId = partyId;
	}
	
	
}