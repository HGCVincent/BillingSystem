package com.billing.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.dao.IssuingPartyMapper;
import com.billing.invoice.po.IssuingParty;

public class IssuingPartyServiceImpl implements IssuingPartyService {
     @Autowired
     IssuingPartyMapper issuingPartyMapper;

	@Override
	public List<IssuingParty> getAllIssuingParty() {
		return null;
	}

	@Override
	public void insertIssuingParty(IssuingParty issuingParty) {
		issuingPartyMapper.insertSelective(issuingParty);
	}
}
