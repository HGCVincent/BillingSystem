package com.billing.invoice.view;

import java.util.ArrayList;
import java.util.List;

import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.IssuingPartyExample.Criteria;
import com.billing.invoice.service.IssuingPartyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class IssuingPartyView extends BasicView<IssuingParty> {
    IssuingPartyService issuingPartyService;
    IssuingParty issuingParty = new IssuingParty();

	public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 1);
    	records = this.getIssuingPartyService().getAllIssuingParty();
    	return true;
    }

	public IssuingPartyService getIssuingPartyService() {
		return issuingPartyService;
	}

	public void setIssuingPartyService(IssuingPartyService issuingPartyService) {
		this.issuingPartyService = issuingPartyService;
	}
    
    
}
