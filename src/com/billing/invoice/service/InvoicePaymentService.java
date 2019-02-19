package com.billing.invoice.service;

import java.util.List;

import com.billing.invoice.po.InvoicePayment;

import net.sf.json.JSONArray;

public interface InvoicePaymentService {

	List<InvoicePayment> searchInvoicePaymentListInfo(InvoicePayment invoicePaymentCriteria);

	List<InvoicePayment> getInvoicePaymentBySeqAndId(String paymentSeq, String paymentId);

	void saveInvoicePayment(InvoicePayment payment);

	int getInvoicePaymentMaxPaymentSeq();

	void updateInvoicePayment(InvoicePayment payment);

	
}
