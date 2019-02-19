package com.billing.invoice.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.dao.InvoicePaymentMapper;
import com.billing.invoice.po.InvoicePayment;
import com.billing.invoice.po.InvoicePaymentExample;
import com.billing.invoice.po.InvoicePaymentExample.Criteria;

public class InvoicePaymentServiceImpl implements InvoicePaymentService {
	@Autowired
    InvoicePaymentMapper invoicePaymentMapper;
	
	@Override
	public List<InvoicePayment> searchInvoicePaymentListInfo(InvoicePayment invoicePaymentCriteria) {
		InvoicePaymentExample example = new InvoicePaymentExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsLatestVerEqualTo("Y");
		return invoicePaymentMapper.selectByExample(example);
	}

	@Override
	public List<InvoicePayment> getInvoicePaymentBySeqAndId(String paymentSeq, String paymentId) {
		InvoicePaymentExample example = new InvoicePaymentExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNoneEmpty(paymentSeq)) {
			criteria.andPaymentSeqEqualTo(Integer.valueOf(paymentSeq));
		}
		if (StringUtils.isNoneEmpty(paymentId)) {
			criteria.andPaymentIdEqualTo(Integer.valueOf(paymentId));
		}
		return invoicePaymentMapper.selectByExample(example);
	}

	@Override
	public void saveInvoicePayment(InvoicePayment payment) {
		invoicePaymentMapper.insertSelective(payment);
		
	}

	@Override
	public int getInvoicePaymentMaxPaymentSeq() {
		return 0;
	}

	@Override
	public void updateInvoicePayment(InvoicePayment payment) {
		InvoicePaymentExample example = new InvoicePaymentExample();
		Criteria criteria = example.createCriteria();
		criteria.andPaymentSeqEqualTo(payment.getPaymentSeq());
		invoicePaymentMapper.updateByExampleSelective(payment, example );
	}

	

}
