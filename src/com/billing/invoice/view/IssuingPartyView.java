package com.billing.invoice.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.billing.common.JsonConvertor;
import com.billing.common.Page;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.IssuingPartyExample.Criteria;
import com.billing.invoice.service.IssuingPartyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.sf.json.JSONArray;


public class IssuingPartyView extends BasicView<IssuingParty> {
    IssuingPartyService issuingPartyService;
    IssuingParty issuingPartyCriteria = new IssuingParty();

	public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 3);
    	records = this.getIssuingPartyService().getIssuingPartiesByCriteria(issuingPartyCriteria);
    	PageInfo<IssuingParty> pageInfo =new PageInfo<IssuingParty>(records,5);
        page = new Page(pageInfo);
    	return true;
    }

	public String updateOrAddInvoiceItem(String jsonPaymentItem,boolean isUpdate){
		IssuingParty issuingPartyPro = new IssuingParty();
		issuingPartyPro = JsonConvertor.convertToObject(jsonPaymentItem, IssuingParty.class);
		if(!isUpdate){
			this.getIssuingPartyService().insertIssuingParty(issuingPartyPro);
			return "success";
		}else {
			this.getIssuingPartyService().updateIssuingParty(issuingPartyPro);
			Map<String, String> resultMap = new HashMap<String, String>();
	        resultMap.put("result","success");
	        resultMap.put("pty_id",String.valueOf(issuingPartyPro.getPartyId()));
	        resultMap.put("pty_name",String.valueOf(issuingPartyPro.getPartyName()));
	        resultMap.put("pty_tel",String.valueOf(issuingPartyPro.getPartyTel()));
	        resultMap.put("pty_address",String.valueOf(issuingPartyPro.getAddress()));
	        resultMap.put("bank_name",String.valueOf(issuingPartyPro.getBankName()));
	        resultMap.put("bank_account",String.valueOf(issuingPartyPro.getBankAccount()));
	        resultMap.put("currency",String.valueOf(issuingPartyPro.getCurrency()));
	        return JSONArray.fromObject(resultMap).toString();
		}
		
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
