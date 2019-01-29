package com.billing.invoice.view;

import java.util.ArrayList;
import java.util.List;

import com.billing.common.JsonConvertor;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.IssuingPartyExample.Criteria;
import com.billing.invoice.service.IssuingPartyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class IssuingPartyView extends BasicView<IssuingParty> {
    IssuingPartyService issuingPartyService;
    IssuingParty issuingPartyCriteria = new IssuingParty();

	public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 1);
    	records = this.getIssuingPartyService().getIssuingPartiesByCriteria(issuingPartyCriteria);
//		records = this.getIssuingPartyService().getAllIssuingParty();
    	return true;
    }

	public String updateOrAddInvoiceItem(String jsonPaymentItem){
		IssuingParty issuingPartyPro = new IssuingParty();
		issuingPartyPro = JsonConvertor.convertToObject(jsonPaymentItem, IssuingParty.class);
		this.getIssuingPartyService().insertIssuingParty(issuingPartyPro);
		return "success";
	}
	
	public String deleteIssuingParty(Integer ptyId){
		IssuingParty deleteParty = new IssuingParty();
        deleteParty.setPartyId(ptyId);
        this.getIssuingPartyService().deleteIssuingParty(deleteParty);
        return "success";
	}
	
	public void a(){
		
	}
	
	public IssuingPartyService getIssuingPartyService() {
		return issuingPartyService;
	}

	public void setIssuingPartyService(IssuingPartyService issuingPartyService) {
		this.issuingPartyService = issuingPartyService;
	}

	public IssuingParty getIssuingPartyCriteria() {
		return issuingPartyCriteria;
	}

	public void setIssuingPartyCriteria(IssuingParty issuingPartyCriteria) {
		this.issuingPartyCriteria = issuingPartyCriteria;
	}
    
	
    
}
