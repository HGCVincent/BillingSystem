package com.billing.invoice.view;

import static org.hamcrest.CoreMatchers.nullValue;

import com.billing.invoice.criteria.InvoiceListCriteria;
import com.billing.invoice.dto.InvoiceListDto;
import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.service.InvoiceListService;
import com.github.pagehelper.PageHelper;

public class InvoiceListView extends BasicView<InvoiceListDto> {
	public static final String CONFIRM_STRING = "рях╥хо";
	public static final String YES_STRING = "Y";
	public static final String NO_STRING = "N";
    InvoiceListService invoiceListService;
    InvoiceListCriteria invoiceListCriteria = new InvoiceListCriteria(); 
    
    public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 3);
    	records = this.getInvoiceListService().getInvoiceListByCriteria(invoiceListCriteria);
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
    
    
}
