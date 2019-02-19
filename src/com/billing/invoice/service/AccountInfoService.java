package com.billing.invoice.service;

import java.util.List;
import java.util.Map;

import com.billing.invoice.dto.AccountInfoDTO;
import com.billing.invoice.po.AccountInfo;

public interface AccountInfoService {
    public List<AccountInfoDTO> getAccountInfoByCriteria(AccountInfo accountInfo);
    
    public List<AccountInfo> getAccountInfosById(Long id);
    
    public AccountInfo getAccountInfoByIdAndBankName(Long id,String bankName);
    
    public void deleteAccountInfoByIdAndBankName(Long id,String bankName);
    
    public void addAccountInfo(AccountInfo accountInfo);
    
    public void updateIsDefaultByIdAndBankName(Long id,String bankName);

	public List<AccountInfo> getAccountByAccountIdAndPayerName(int accountId, String payerName);

	public List<AccountInfo> getPayerAccount(String payerName, int accountId);
}
