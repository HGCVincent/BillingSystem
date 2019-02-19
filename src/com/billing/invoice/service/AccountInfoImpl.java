package com.billing.invoice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.dao.AccountInfoMapper;
import com.billing.invoice.dto.AccountInfoDTO;
import com.billing.invoice.po.AccountInfo;
import com.billing.invoice.po.AccountInfoExample;
import com.billing.invoice.po.AccountInfoExample.Criteria;

public class AccountInfoImpl implements AccountInfoService{
    @Autowired
	AccountInfoMapper accountInfoMapper;
	
	@Override
	public List<AccountInfoDTO> getAccountInfoByCriteria(AccountInfo accountInfoCriteria) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		System.out.println(accountInfoCriteria.getAccountId());
		if(StringUtils.isNoneEmpty(accountInfoCriteria.getCustName())){
			criteria.andCustNameEqualTo(accountInfoCriteria.getCustName());
		}
		List<AccountInfo> accountInfos = accountInfoMapper.selectByExample(accountInfoExample);
		Map<Long, AccountInfoDTO> result = new HashMap<Long, AccountInfoDTO>();
		for (AccountInfo accountInfo : accountInfos) {
			if(result.containsKey(accountInfo.getAccountId())){
				AccountInfoDTO temp = result.get(accountInfo.getAccountId());
				String AccountNameGroup = temp.getAccountNameGroup() + accountInfo.getTaxInvName() + " ;";
				temp.setAccountNameGroup(AccountNameGroup);
				result.put(accountInfo.getAccountId(), temp);
			}
			else {
				String AccountNameGroup = accountInfo.getTaxInvName() + " ;";
				accountInfo.setTaxInvName(AccountNameGroup);
				AccountInfoDTO temp = new AccountInfoDTO(accountInfo);
				result.put(accountInfo.getAccountId(),temp);
			}
		}
		
		return new ArrayList<AccountInfoDTO>(result.values());
	}

	@Override
	public List<AccountInfo> getAccountInfosById(Long id) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		criteria.andAccountIdEqualTo(id);
		return accountInfoMapper.selectByExample(accountInfoExample);
	}

	@Override
	public void deleteAccountInfoByIdAndBankName(Long id, String bankName) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		criteria.andAccountIdEqualTo(id);
		criteria.andTaxInvNameEqualTo(bankName);
		accountInfoMapper.deleteByExample(accountInfoExample);
		
	}

	@Override
	public void addAccountInfo(AccountInfo accountInfo) {
		accountInfoMapper.insert(accountInfo);
	}

	@Override
	public void updateIsDefaultByIdAndBankName(Long id, String bankName) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		criteria.andAccountIdEqualTo(id);
		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setIsdefault("N");
		accountInfoMapper.updateByExampleSelective(accountInfo, accountInfoExample);
		criteria.andTaxInvNameEqualTo(bankName);
		accountInfo.setIsdefault("Y");
		accountInfoMapper.updateByExampleSelective(accountInfo, accountInfoExample);	
	}

	@Override
	public AccountInfo getAccountInfoByIdAndBankName(Long id, String bankName) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		criteria.andAccountIdEqualTo(id);
		criteria.andTaxInvNameEqualTo(bankName);
		return (AccountInfo) accountInfoMapper.selectByExample(accountInfoExample);
	}

	@Override
	public List<AccountInfo> getAccountByAccountIdAndPayerName(int accountId, String payerName) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		if (accountId != 0) {
			criteria.andAccountIdEqualTo((long)accountId);
		}
		if (StringUtils.isNoneEmpty(payerName)) {
			criteria.andTaxInvNameEqualTo(payerName);
		}
		return accountInfoMapper.selectByExample(accountInfoExample);
	}

	@Override
	public List<AccountInfo> getPayerAccount(String payerName, int accountId) {
		AccountInfoExample accountInfoExample = new AccountInfoExample();
		Criteria criteria = accountInfoExample.createCriteria();
		if (StringUtils.isNoneEmpty(payerName)) {
			criteria.andTaxInvNameEqualTo(payerName);
		}
		if (accountId != 0) {
			criteria.andAccountIdEqualTo((long)accountId);
		}
		return accountInfoMapper.selectByExample(accountInfoExample);
	}

	

}
