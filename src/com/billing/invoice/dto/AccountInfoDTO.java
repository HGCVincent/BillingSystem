package com.billing.invoice.dto;

import com.billing.invoice.po.AccountInfo;

public class AccountInfoDTO {
    public Long accountId;
    public String customerName;
    public String accountNameGroup;
    
	public AccountInfoDTO() {
		super();
	}
	public AccountInfoDTO(AccountInfo accountInfo) {
		this.setAccountId(accountInfo.getAccountId());
		this.setAccountNameGroup(accountInfo.getTaxInvName());
		this.setCustomerName(accountInfo.getCustName());
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountNameGroup() {
		return accountNameGroup;
	}
	public void setAccountNameGroup(String accountNameGroup) {
		this.accountNameGroup = accountNameGroup;
	}
}
