package com.billing.invoice.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.dao.IssuingPartyMapper;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.IssuingPartyExample.Criteria;

public class IssuingPartyServiceImpl implements IssuingPartyService {
     @Autowired
     IssuingPartyMapper issuingPartyMapper;

	@Override
	public List<IssuingParty> getAllIssuingParty() {
		return issuingPartyMapper.selectByExample(null);
	}

	@Override
	public void insertIssuingParty(IssuingParty issuingParty) {
		issuingPartyMapper.insertSelective(issuingParty);
	}

	@Override
	public List<IssuingParty> getIssuingPartiesByCriteria(IssuingParty issuingPartyCriteria) {
		IssuingPartyExample issuingPartyExample = new IssuingPartyExample();
		Criteria criteria = issuingPartyExample.createCriteria();
		if(StringUtils.isNoneEmpty(issuingPartyCriteria.getPartyName())){
			criteria.andPartyNameLike(issuingPartyCriteria.getPartyName());
		}
		if(StringUtils.isNoneEmpty(issuingPartyCriteria.getAddress())){
			criteria.andAddressLike(issuingPartyCriteria.getAddress());
		}
		if (StringUtils.isNoneEmpty(issuingPartyCriteria.getBankAccount())) {
			criteria.andBankAccountLike(issuingPartyCriteria.getBankAccount());
		}
		if (StringUtils.isNoneEmpty(issuingPartyCriteria.getBankName())) {
			criteria.andBankNameLike(issuingPartyCriteria.getBankName());
		}
		return issuingPartyMapper.selectByExample(issuingPartyExample);
	}

	@Override
	public void deleteIssuingParty(IssuingParty deleteParty) {
		IssuingPartyExample issuingPartyExample = new IssuingPartyExample();
		Criteria criteria = issuingPartyExample.createCriteria();
		criteria.andPartyIdEqualTo(deleteParty.getPartyId());
		issuingPartyMapper.deleteByExample(issuingPartyExample);
	}

	@Override
	public void updateIssuingParty(IssuingParty issuingParty) {
		IssuingPartyExample issuingPartyExample = new IssuingPartyExample();
		Criteria criteria = issuingPartyExample.createCriteria();
		criteria.andPartyIdEqualTo(issuingParty.getPartyId());
		issuingPartyMapper.updateByExampleSelective(issuingParty, issuingPartyExample);
		
	}
	
	
}
