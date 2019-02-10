package com.billing.invoice.view;

import static org.hamcrest.CoreMatchers.nullValue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.billing.common.Currency;
import com.billing.common.JsonConvertor;
import com.billing.invoice.criteria.InvoiceListCriteria;
import com.billing.invoice.dto.InvoiceListDto;
import com.billing.invoice.po.CustomerProfile;
import com.billing.invoice.po.InvoiceItemDesc;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.service.CustomerProfileService;
import com.billing.invoice.service.InvoiceListService;
import com.billing.invoice.service.IssuingPartyService;
import com.github.pagehelper.PageHelper;

public class InvoiceListView extends BasicView<SystemInvoice> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String CONFIRM_STRING = "已确认";
	public static final String CANCEL_STRING = "取消";
	public static final String YES_STRING = "Y";
	public static final String NO_STRING = "N";
    InvoiceListService invoiceListService;
    IssuingPartyService invIssuingPartyService;
    CustomerProfileService customerProfileService;
    InvoiceListCriteria invoiceListCriteria = new InvoiceListCriteria();
    List<String> currency;
    List<InvoiceListDto> dtoRecords;
    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");

	public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 3);
    	records = this.getInvoiceListService().getInvoiceListByCriteria(invoiceListCriteria);
//    	dtoRecords = new ArrayList<InvoiceListDto>();
		for (SystemInvoice systemInvoice : records) {
			this.getDtoRecords().add(new InvoiceListDto(systemInvoice));
		}
		this.getRecords();
    	return true;
    }
    
    public String makeTheStatusToConfirm(String invId,String custId,int version,String currentMonth){
    	SystemInvoice systemInvoice = this.getInvoiceListService().getInvoiceListByPK(invId,custId,version,currentMonth);
    	systemInvoice.setIsLatestVer(NO_STRING);
    	this.getInvoiceListService().Update(systemInvoice);
    	systemInvoice.setInvVersion(version+1);
    	systemInvoice.setInvStatus(CONFIRM_STRING);
    	systemInvoice.setIsLatestVer(YES_STRING);
    	this.getInvoiceListService().insert(systemInvoice);
    	return YES_STRING;
    }
    
    public String makeTheStatusToCancel(String invId,String custId,int version,String currentMonth){
    	SystemInvoice systemInvoice = this.getInvoiceListService().getInvoiceListByPK(invId, custId, version, currentMonth);
    	systemInvoice.setIsLatestVer(NO_STRING);
    	this.getInvoiceListService().Update(systemInvoice);
    	systemInvoice.setInvVersion(version + 1);
    	systemInvoice.setIsLatestVer(YES_STRING);
    	systemInvoice.setInvStatus(CANCEL_STRING);
    	this.getInvoiceListService().insert(systemInvoice);
    	return YES_STRING;
    }
    
    public List<String> getIssuingParties() {
		List<IssuingParty> Parties =this.getInvIssuingPartyService().getAllIssuingParty();
		List<String> ptyNames = new ArrayList<String>();
		for (IssuingParty pty : Parties) {
			ptyNames.add(pty.getPartyName());
		}
		return ptyNames;
	}
  
    public String getMaxInvId(){
    	int maxSeqId = this.getInvoiceListService().getMaxSeqId() + 1;
    	return "INV" + maxSeqId;
    }
    
    public CustomerProfile getCustomerProfileById(String id){
    	CustomerProfile customerProfile = getCustomerProfileService().getCustomerProfileById(id);
    	return customerProfile;
    }
    
    public String saveInvoiceList(String jsonInvoiceList,List<InvoiceItemDesc> invoiceItemDescs,boolean isUpdate){
	    SystemInvoice systemInvoice = JsonConvertor.convertToObject(jsonInvoiceList, SystemInvoice.class);
	    if(!isUpdate){
	    	systemInvoice.setInvVersion(1);
	    	systemInvoice.setCurrentMonth(sdf.format(systemInvoice.getInvDt()).toString());
	    	this.getInvoiceListService().insert(systemInvoice);
	    	saveInvoiceItem(systemInvoice,invoiceItemDescs);
	    	return YES_STRING;
    	}
    	else {
    		saveInvoiceItem(systemInvoice,invoiceItemDescs);
			return YES_STRING;
		}
    }
    
    public String saveInvoiceItem(SystemInvoice systemInvoice,List<InvoiceItemDesc> invoiceItemDescs){
    	for (InvoiceItemDesc invoiceItemDesc : invoiceItemDescs) {
    		if(invoiceItemDesc !=null){
    			if(invoiceItemDesc.getInvDescId() == 0){
		    			invoiceItemDesc.setCustomerId(systemInvoice.getCustId());
		    			invoiceItemDesc.setInvoiceId(systemInvoice.getInvId());
		    			invoiceItemDesc.setItemCurrentMonth(systemInvoice.getCurrentMonth());
		    			this.getInvoiceListService().insertInvoieItem(invoiceItemDesc);
				}
    			else{
    			    this.getInvoiceListService().upDateInvoieItem(invoiceItemDesc);
    			}
			}
		}
    	return YES_STRING;
    }
    
    public List<InvoiceItemDesc> findInvoiceItem(String invId,String custId,String currentMonth){
    	return this.getInvoiceListService().findInvoiceItem(invId,custId,currentMonth);
    }
    
    public Map<String,String> getInvoiceCustomerMessageById(String id){
		CustomerProfile pro = this.getCustomerProfileById(id);
		Map<String,String> CustomerMessage = new HashMap<String,String>();
		CustomerMessage.put("Address1", pro.getAddr1());
		CustomerMessage.put("Address2", pro.getAddr2());
		CustomerMessage.put("Address3", pro.getAddr3());
		CustomerMessage.put("ATTN_Name", pro.getAcctBdOwner());
		CustomerMessage.put("ATTN_Tel", pro.getAcctBdOwnerTel());
		CustomerMessage.put("ATTN_Email", pro.getAcctBdOwnerEmail());
		CustomerMessage.put("Bill_RefNo1", "QUOTATION REF NUMBER:");
		CustomerMessage.put("HTML_TEM", pro.getInvoiceTemplateCode());
		return CustomerMessage;
	}
    
    public List<SystemInvoice> getInvoiceListHistory(String id){
    	return this.getInvoiceListService().getInvoiceListHistory(id);
    }
//--------------------------------------------------------------------------
	public InvoiceListCriteria getInvoiceListCriteria() {
		return invoiceListCriteria;
	}

	public void setInvoiceListCriteria(InvoiceListCriteria invoiceListCriteria) {
		this.invoiceListCriteria = invoiceListCriteria;
	}

	public InvoiceListService getInvoiceListService() {
		return invoiceListService;
	}

	public void setInvoiceListService(InvoiceListService invoiceListService) {
		this.invoiceListService = invoiceListService;
	}
	
	

	public IssuingPartyService getInvIssuingPartyService() {
		return invIssuingPartyService;
	}

	public void setInvIssuingPartyService(IssuingPartyService invIssuingPartyService) {
		this.invIssuingPartyService = invIssuingPartyService;
	}

	public List<String> getCurrency() {
		return new Currency().getCurrencyList();
		
	}

	public void setCurrency(List<String> currency) {
		this.currency = currency;
	}

	public CustomerProfileService getCustomerProfileService() {
		return customerProfileService;
	}

	public void setCustomerProfileService(CustomerProfileService customerProfileService) {
		this.customerProfileService = customerProfileService;
	}

	public List<InvoiceListDto> getDtoRecords() {
		if (null == dtoRecords) {
			dtoRecords =  new ArrayList<InvoiceListDto>();
			return dtoRecords;
		}
		return dtoRecords;
	}

	public void setDtoRecords(List<InvoiceListDto> dtoRecords) {
		this.dtoRecords = dtoRecords;
	}

	
	
    
	
	
    
}
