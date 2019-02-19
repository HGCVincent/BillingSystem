package com.billing.invoice.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.javassist.runtime.Inner;

import com.billing.common.JsonConvertor;
import com.billing.common.Page;
import com.billing.invoice.dto.InvoicePaymentDTO;
import com.billing.invoice.po.AccountInfo;
import com.billing.invoice.po.InvoiceItemDesc;
import com.billing.invoice.po.InvoicePayment;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.IssuingPartyExample.Criteria;
import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.service.AccountInfoService;
import com.billing.invoice.service.CustomerProfileService;
import com.billing.invoice.service.InvoiceListService;
import com.billing.invoice.service.InvoicePaymentService;
import com.billing.invoice.service.IssuingPartyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.sf.json.JSONArray;


public class InvoicePaymentView extends BasicView<InvoicePayment> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvoicePaymentService invoicePaymentService;
	InvoiceListService invoiceListService;
	CustomerProfileService customerProfileService;
	AccountInfoService accountInfoService;
	InvoicePayment invoicePayment = new InvoicePayment();
    InvoicePayment invoicePaymentCriteria = new InvoicePayment();
    List<InvoicePaymentDTO> invoicePaymentDTOs = new ArrayList<InvoicePaymentDTO>();

	public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 3);
    	records = this.getInvoicePaymentService().searchInvoicePaymentListInfo(invoicePaymentCriteria);
    	for (InvoicePayment payment : records) {
			float amt = 0;
			String curr = null;
            List<SystemInvoice> invoiceLists = this.getInvoiceListService().findInvoiceListByinvRefNo(
            		payment.getInvRefNo(),payment.getCustId(),payment.getCurrentMonth(),"Y");
            if (invoiceLists.size() != 0) {
                SystemInvoice invoiceList = invoiceLists.get(0);
                for (InvoiceItemDesc invoiceItemDescption : invoiceList.getInvoiceItemDescs()) {
                    amt = amt + invoiceItemDescption.getItemAmt();
                    curr = invoiceItemDescption.getItemCurrency();
                }
                InvoicePaymentDTO dto = new InvoicePaymentDTO();
                dto.setInvoiceAmt(amt);
                dto.setInvoiceCurrency(curr);
                if (payment.getPaymentAmt() != 0) {
                    dto.setPaymentAmt(payment.getPaymentAmt());
                    dto.setPaymentCurrency(payment.getPaymentCurrency());
                } else {
                    dto.setPaymentAmt(amt);
                    dto.setPaymentCurrency(curr);
                }
                dto.convertInvoicePaymentToInvoicePaymentDTO(dto, payment, invoiceList);
                invoicePaymentDTOs.add(dto);
            }
		}
    	return true;
    }
	
	public String getInvoicePaymentHistory(String paymentSeq,String paymentId){
		List<InvoicePayment> invoicePayments = this.getInvoicePaymentService().getInvoicePaymentBySeqAndId(null,paymentId);
		return JSONArray.fromObject(invoicePayments).toString();
	}
   
	public List<AccountInfo> getAccountByCustomerId(String custId){
		int accountId = this.getCustomerProfileService().getAccountIdByCustId(custId);
		List<AccountInfo> accountInfos = this.getAccountInfoService().getAccountByAccountIdAndPayerName(accountId,null);
		return accountInfos;
	}
	
	public List<AccountInfo> getPayerAccount(String payerName,int accountId){
        return getAccountInfoService().getPayerAccount(payerName,accountId);
    }
	
	public void updateInvoicePayment(){
    	InvoicePayment payment = new InvoicePayment();
    	payment = this.getInvoicePaymentService().getInvoicePaymentBySeqAndId(String.valueOf(invoicePayment.getPaymentSeq()),null).get(0);
    	
		payment.setIsLatestVer("N");
		getInvoicePaymentService().updateInvoicePayment(payment);

        invoicePayment.setCustId(payment.getCustId());
        invoicePayment.setCustName(payment.getCustName());
        invoicePayment.setInvRefNo(payment.getInvRefNo());
        invoicePayment.setBillComp(payment.getBillComp());
        invoicePayment.setCurrentMonth(payment.getCurrentMonth());
		invoicePayment.setVersion(payment.getVersion() + 1);
		invoicePayment.setIsLatestVer("Y");
		invoicePayment.setPaymentSeq(0);
		invoicePayment.setPaymentId(payment.getPaymentId());
//		invoicePayment.setModifyBy(SecurityContextHolder.getContext()
//				.getAuthentication().getName());
		invoicePayment.setModifyDate(new Date());
		invoicePayment.setStatus("“—«ÂÀ„");
//		updateArMointorItemPaymentInfo();
		getInvoicePaymentService().saveInvoicePayment(invoicePayment);
        doSearch();
    }
	
	public InvoicePaymentService getInvoicePaymentService() {
		return invoicePaymentService;
	}

	public void setInvoicePaymentService(InvoicePaymentService invoicePaymentService) {
		this.invoicePaymentService = invoicePaymentService;
	}

	public InvoicePayment getInvoicePaymentCriteria() {
		return invoicePaymentCriteria;
	}

	public void setInvoicePaymentCriteria(InvoicePayment invoicePaymentCriteria) {
		this.invoicePaymentCriteria = invoicePaymentCriteria;
	}

	public List<InvoicePaymentDTO> getInvoicePaymentDTOs() {
		return invoicePaymentDTOs;
	}

	public void setInvoicePaymentDTOs(List<InvoicePaymentDTO> invoicePaymentDTOs) {
		this.invoicePaymentDTOs = invoicePaymentDTOs;
	}

	public InvoiceListService getInvoiceListService() {
		return invoiceListService;
	}

	public void setInvoiceListService(InvoiceListService invoiceListService) {
		this.invoiceListService = invoiceListService;
	}

	public CustomerProfileService getCustomerProfileService() {
		return customerProfileService;
	}

	public void setCustomerProfileService(CustomerProfileService customerProfileService) {
		this.customerProfileService = customerProfileService;
	}

	public AccountInfoService getAccountInfoService() {
		return accountInfoService;
	}

	public void setAccountInfoService(AccountInfoService accountInfoService) {
		this.accountInfoService = accountInfoService;
	}

	public InvoicePayment getInvoicePayment() {
		return invoicePayment;
	}

	public void setInvoicePayment(InvoicePayment invoicePayment) {
		this.invoicePayment = invoicePayment;
	}
	
}
