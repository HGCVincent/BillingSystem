package com.billing.invoice.service;

import java.util.List;

import com.billing.invoice.criteria.InvoiceListCriteria;
import com.billing.invoice.dto.InvoiceListDto;
import com.billing.invoice.po.InvoiceItemDesc;
import com.billing.invoice.po.SystemInvoice;

public interface InvoiceListService {

	List<SystemInvoice> getInvoiceListByCriteria(InvoiceListCriteria invoiceListCriteria);

	SystemInvoice getInvoiceListByPK(String invId, String custId, int version, String currentMonth);

	void Update(SystemInvoice systemInvoice);

	void insert(SystemInvoice systemInvoice);

	int getMaxSeqId();

	void insertInvoieItem(InvoiceItemDesc invoiceItemDesc);

	List<InvoiceItemDesc> findInvoiceItem(String invId, String custId, String currentMonth);

	void upDateInvoieItem(InvoiceItemDesc invoiceItemDesc);

	List<SystemInvoice> getInvoiceListHistory(String id);

	List<SystemInvoice> findInvoiceListByinvRefNo(String invoiceRefNumber, String customerId, String currentMonth, String isLatestVersion);

}
