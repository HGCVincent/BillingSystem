package com.billing.invoice.view;

import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.IssuingPartyExample.Criteria;
import com.billing.invoice.service.IssuingPartyService;


public class IssuingPartyView extends BasicView {
    IssuingPartyService issuingPartyService;
    IssuingParty issuingParty = new IssuingParty();
    
    public void Search(){
    	
    }

	public IssuingPartyService getIssuingPartyService() {
		return issuingPartyService;
	}

	public void setIssuingPartyService(IssuingPartyService issuingPartyService) {
		this.issuingPartyService = issuingPartyService;
	}
    
    
}
