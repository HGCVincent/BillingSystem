package com.billing.invoice.service;

import java.util.List;

import com.billing.invoice.criteria.InvoiceListCriteria;
import com.billing.invoice.dto.InvoiceListDto;
import com.billing.invoice.po.SystemInvoice;

public interface InvoiceListService {

	List<SystemInvoice> getInvoiceListByCriteria(InvoiceListCriteria invoiceListCriteria);

	SystemInvoice getInvoiceListByPK(String invId, String custId, int version, String currentMonth);

	void Update(SystemInvoice systemInvoice);

	void insert(SystemInvoice systemInvoice);

	int getMaxSeqId();

}
