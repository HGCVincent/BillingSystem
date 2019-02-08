package com.billing.invoice.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.billing.invoice.dao.IssuingPartyMapper;
import com.billing.invoice.dao.SystemInvoiceMapper;
import com.billing.invoice.dao.SystemInvoiceMapperCustom;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.po.SystemInvoiceExample;
import com.billing.invoice.po.SystemInvoiceExample.Criteria;
import com.billing.invoice.service.IssuingPartyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext*.xml"})
public class MybatisTest {
	@Autowired
	IssuingPartyMapper issuingPartyMapper;
	@Autowired
	IssuingPartyService issuingPartyService;
	@Autowired
	SystemInvoiceMapperCustom systemInvoiceMapper;
	
//    public IssuingPartyService getIssuingPartyService() {
//		return issuingPartyService;
//	}
//
//	public void setIssuingPartyService(IssuingPartyService issuingPartyService) {
//		this.issuingPartyService = issuingPartyService;
//	}



	@Test
    public void testone(){
//    	System.out.println(issuingPartyMapper);
//    	IssuingParty issuingParty = new IssuingParty("开票单位3", "地址3", "电话3", "USD", "1231", "银行3", 123);
//    	issuingPartyService.insertIssuingParty(issuingParty);
//    	IssuingPartyExample issuingPartyExample = new IssuingPartyExample();
//    	Criteria criteria = issuingPartyExample.createCriteria();
//    	criteria.andPartyIdEqualTo(123);
//    	issuingPartyMapper.deleteByExample(issuingPartyExample);
//		List<IssuingParty> issuingParties = issuingPartyService.getAllIssuingParty();
//		System.out.println(issuingParties.get(0).getAddress());
		SystemInvoiceExample systemInvoiceExample = new SystemInvoiceExample();
		Criteria criteria = systemInvoiceExample.createCriteria();
		criteria.andIsLatestVerEqualTo("Y");
		List<SystemInvoice> systemInvoices = systemInvoiceMapper.selectByExamplePlus(systemInvoiceExample);
		for (SystemInvoice systemInvoice : systemInvoices) {
			System.out.println(systemInvoice);
		}
		
}
}
