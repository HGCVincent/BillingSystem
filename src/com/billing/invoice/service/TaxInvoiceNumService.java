package com.billing.invoice.service;

import java.util.List;

import com.billing.invoice.criteria.TaxInvoiceNumCriteria;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.TaxInvoiceNum;

public interface TaxInvoiceNumService {
	public List<TaxInvoiceNum> getAllTaxInvoiceNumsByCriteria(TaxInvoiceNumCriteria criteria);
	
	public List<TaxInvoiceNum> searchTaxInvoiceListByTaxFromAndTo(Integer TaxInvBatch,Integer From,Integer to);

	public void addTaxInvoiceNum(TaxInvoiceNum createTaxInvoiceNum);
}
