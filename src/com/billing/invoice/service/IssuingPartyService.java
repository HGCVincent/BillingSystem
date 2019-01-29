package com.billing.invoice.service;

import java.util.List;

import com.billing.invoice.po.IssuingParty;

public interface IssuingPartyService {
	public List<IssuingParty> getAllIssuingParty();
	
	public void insertIssuingParty(IssuingParty issuingParty);
	
	public List<IssuingParty> getIssuingPartiesByCriteria(IssuingParty issuingPartyCriteria);
	
	public void deleteIssuingParty(IssuingParty deleteParty);
	
	public void updateIssuingParty(IssuingParty issuingParty);
}
