package com.billing.invoice.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.criteria.TaxInvoiceNumCriteria;
import com.billing.invoice.dao.TaxInvoiceNumMapper;
import com.billing.invoice.po.TaxInvoiceNum;
import com.billing.invoice.po.TaxInvoiceNumExample;
import com.billing.invoice.po.TaxInvoiceNumExample.Criteria;

public class TaxInvoiceNumServiceImpl implements TaxInvoiceNumService {
    @Autowired
	TaxInvoiceNumMapper taxInvoiceNumMapper;

	@Override
	public List<TaxInvoiceNum> getAllTaxInvoiceNumsByCriteria(TaxInvoiceNumCriteria criteria) {
		TaxInvoiceNumExample example = new TaxInvoiceNumExample();
		Criteria criteria2 = example.createCriteria();
		if (StringUtils.isNoneEmpty(criteria.getTaxInvBatch())) {
			criteria2.andTaxInvBatchEqualTo(Integer.valueOf(criteria.getTaxInvBatch()));
		}
		if (StringUtils.isNoneEmpty(criteria.getOffice())) {
			criteria2.andOfficeEqualTo(criteria.getOffice());
		}
		if (StringUtils.isNoneEmpty(criteria.getTaxInvTyp())) {
			criteria2.andTaxInvTypeEqualTo(criteria.getTaxInvTyp());
		}
		return taxInvoiceNumMapper.selectByExample(example);
	}

	@Override
	public List<TaxInvoiceNum> searchTaxInvoiceListByTaxFromAndTo(Integer TaxInvBatch, Integer From, Integer to) {
		TaxInvoiceNumExample example = new TaxInvoiceNumExample();
		Criteria criteria = example.createCriteria();
        criteria.andTaxInvBatchEqualTo(TaxInvBatch);
        criteria.andTaxFromEqualTo(From);
        criteria.andTaxToEqualTo(to);
		return taxInvoiceNumMapper.selectByExample(example);
	}

	@Override
	public void addTaxInvoiceNum(TaxInvoiceNum createTaxInvoiceNum) {
		taxInvoiceNumMapper.insertSelective(createTaxInvoiceNum);
		
	}
	

}
