package com.billing.invoice.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.billing.common.JsonConvertor;
import com.billing.invoice.dto.AccountInfoDTO;
import com.billing.invoice.po.AccountInfo;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.service.AccountInfoService;
import com.github.pagehelper.PageHelper;

import net.sf.json.JSONArray;

public class AccountInfoView extends BasicView<AccountInfoDTO> {
	public AccountInfoService accountInfoService;
    public AccountInfo accountInfoCriteria = new AccountInfo();
    
    public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum),30);
    	records = this.getAccountInfoService().getAccountInfoByCriteria(accountInfoCriteria);
    	return true;
    }
    
    public Map<String, AccountInfo> findBankInfo(Long id){
    	List<AccountInfo> accountInfos = this.getAccountInfoService().getAccountInfosById(id);
    	Map<String, AccountInfo> result = new HashMap<String, AccountInfo>();
    	for (AccountInfo accountInfo : accountInfos) {
			result.put(accountInfo.getTaxInvName(), accountInfo);
		}
    	return result;
    }
    
    public String deleteAccount(Long id ,String bankName){
    	this.getAccountInfoService().deleteAccountInfoByIdAndBankName(id, bankName);
    	return "Y";
    }
    
    public String addAccountInfo(String jsonAccountInfo){
    	AccountInfo accountInfoPro = new AccountInfo();
    	accountInfoPro = JsonConvertor.convertToObject(jsonAccountInfo, AccountInfo.class);
    	this.getAccountInfoService().addAccountInfo(accountInfoPro);
    	return null;
    }
    
	public AccountInfoService getAccountInfoService() {
		return accountInfoService;
	}
	public void setAccountInfoService(AccountInfoService accountInfoService) {
		this.accountInfoService = accountInfoService;
	}

	public AccountInfo getAccountInfoCriteria() {
		return accountInfoCriteria;
	}

	public void setAccountInfoCriteria(AccountInfo accountInfoCriteria) {
		this.accountInfoCriteria = accountInfoCriteria;
	}
    
}
