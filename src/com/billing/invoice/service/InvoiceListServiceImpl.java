package com.billing.invoice.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.criteria.InvoiceListCriteria;
import com.billing.invoice.dao.InvoiceItemDescMapper;
import com.billing.invoice.dao.SystemInvoiceMapper;
import com.billing.invoice.dao.SystemInvoiceMapperCustom;
import com.billing.invoice.dto.InvoiceListDto;
import com.billing.invoice.po.InvoiceItemDesc;
import com.billing.invoice.po.InvoiceItemDescExample;
import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.po.SystemInvoiceExample;
import com.billing.invoice.po.SystemInvoiceExample.Criteria;
import com.billing.invoice.view.InvoiceListView;

public class InvoiceListServiceImpl implements InvoiceListService {
    @Autowired
	SystemInvoiceMapper systemInvoiceMapper;
    @Autowired
    SystemInvoiceMapperCustom systemInvoiceMapperCustom;
    @Autowired
    InvoiceItemDescMapper invoiceItemDescMapper;
	
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
	public List<SystemInvoice> getInvoiceListByCriteria(InvoiceListCriteria invoiceListCriteria) {
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
		return systemInvoiceMapperCustom.selectByExamplePlus(systemInvoiceExample);
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

	@Override
	public int getMaxSeqId() {
		return systemInvoiceMapperCustom.getMaxSeqId();
	}

	@Override
	public void insertInvoieItem(InvoiceItemDesc invoiceItemDesc) {
		invoiceItemDescMapper.insert(invoiceItemDesc);
	}

	@Override
	public List<InvoiceItemDesc> findInvoiceItem(String invId, String custId, String currentMonth) {
		InvoiceItemDescExample invoiceItemDescExample = new InvoiceItemDescExample();
		com.billing.invoice.po.InvoiceItemDescExample.Criteria criteria = invoiceItemDescExample.createCriteria();
		criteria.andInvoiceIdEqualTo(invId);
		criteria.andCustomerIdEqualTo(custId);
		criteria.andItemCurrentMonthEqualTo(currentMonth);
		return invoiceItemDescMapper.selectByExample(invoiceItemDescExample);
	}

	@Override
	public void upDateInvoieItem(InvoiceItemDesc invoiceItemDesc) {
		InvoiceItemDescExample invoiceItemDescExample = new InvoiceItemDescExample();
		com.billing.invoice.po.InvoiceItemDescExample.Criteria criteria = invoiceItemDescExample.createCriteria();
		criteria.andInvDescIdEqualTo(invoiceItemDesc.getInvDescId());
		invoiceItemDescMapper.updateByExampleSelective(invoiceItemDesc, invoiceItemDescExample);
	}

	@Override
	public List<SystemInvoice> getInvoiceListHistory(String id) {
		SystemInvoiceExample systemInvoiceExample = this.getSystemInvoiceExample();
		Criteria criteria = systemInvoiceExample.createCriteria();
		criteria.andInvIdEqualTo(id);
		return systemInvoiceMapper.selectByExample(systemInvoiceExample);
	}

	@Override
	public List<SystemInvoice> findInvoiceListByinvRefNo(String invoiceRefNumber, String customerId,
			String currentMonth, String isLatestVersion) {
		SystemInvoiceExample example = new SystemInvoiceExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNoneEmpty(invoiceRefNumber)) {
           criteria.andInvRefNoEqualTo(invoiceRefNumber);
        }
        if (StringUtils.isNoneEmpty(customerId)) {
           criteria.andCustIdEqualTo(customerId);
        }
        if (StringUtils.isNoneEmpty(currentMonth)) {
           criteria.andCurrentMonthEqualTo(currentMonth);
        }
        if (StringUtils.isNoneEmpty(isLatestVersion)) {
           criteria.andIsLatestVerEqualTo(isLatestVersion);
        }
        return systemInvoiceMapperCustom.selectByExamplePlus(example);
	}

}