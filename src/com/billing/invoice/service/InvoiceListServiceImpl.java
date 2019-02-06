package com.billing.invoice.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.criteria.InvoiceListCriteria;
import com.billing.invoice.dao.SystemInvoiceMapper;
import com.billing.invoice.dto.InvoiceListDto;
import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.po.SystemInvoiceExample;
import com.billing.invoice.po.SystemInvoiceExample.Criteria;
import com.billing.invoice.view.InvoiceListView;

public class InvoiceListServiceImpl implements InvoiceListService {
    @Autowired
	SystemInvoiceMapper systemInvoiceMapper;
	
    SystemInvoiceExample systemInvoiceExample;
    
	public SystemInvoiceExample getSystemInvoiceExample() {
		if (null == systemInvoiceExample) {
			return new SystemInvoiceExample();
		}
		return systemInvoiceExample;
	}

	public void setSystemInvoiceExample(SystemInvoiceExample systemInvoiceExample) {
		this.systemInvoiceExample = systemInvoiceExample;
	}


	@Override
	public List<InvoiceListDto> getInvoiceListByCriteria(InvoiceListCriteria invoiceListCriteria) {
		SystemInvoiceExample systemInvoiceExample = this.getSystemInvoiceExample();
		Criteria criteria = systemInvoiceExample.createCriteria();
		if (StringUtils.isNoneEmpty(invoiceListCriteria.getReferenceNo())) {
			criteria.andInvRefNoEqualTo(invoiceListCriteria.getReferenceNo());
		}
		else {
			if (StringUtils.isNoneEmpty(invoiceListCriteria.getCustId())) {
				criteria.andCustIdLike(invoiceListCriteria.getCustId());
			}
			if (StringUtils.isNoneEmpty(invoiceListCriteria.getCustName())) {
				criteria.andCustNameLike(invoiceListCriteria.getCustName());
			}
			if (StringUtils.isNoneEmpty(invoiceListCriteria.getInvId())) {
				criteria.andInvIdLike(invoiceListCriteria.getInvId());
			}
		}
		criteria.andIsLatestVerEqualTo(InvoiceListView.YES_STRING);
		List<SystemInvoice> selectByExample = systemInvoiceMapper.selectByExample(systemInvoiceExample);
		ArrayList<InvoiceListDto> invoiceListDtos = new ArrayList<InvoiceListDto>();
		for (SystemInvoice systemInvoice : selectByExample) {
			invoiceListDtos.add(new InvoiceListDto(systemInvoice));
		}
		return invoiceListDtos;
	}

	@Override
	public SystemInvoice getInvoiceListByPK(String invId, String custId, int version, String currentMonth) {
		SystemInvoiceExample systemInvoiceExample = this.getSystemInvoiceExample();
	    Criteria criteria = systemInvoiceExample.createCriteria();
	    criteria.andInvIdEqualTo(invId);
	    criteria.andCustIdEqualTo(custId);
	    criteria.andInvVersionEqualTo(version);
	    criteria.andCurrentMonthEqualTo(currentMonth);
		return systemInvoiceMapper.selectByExample(systemInvoiceExample).get(0);
	}

	@Override
	public void Update(SystemInvoice systemInvoice) {
		SystemInvoiceExample example = this.getSystemInvoiceExample();
		Criteria criteria = example.createCriteria();
		criteria.andSeqIdEqualTo(systemInvoice.getSeqId());
		systemInvoiceMapper.updateByExampleSelective(systemInvoice, example);		
	}

	@Override
	public void insert(SystemInvoice systemInvoice) {
		systemInvoiceMapper.insertSelective(systemInvoice);
	}

}