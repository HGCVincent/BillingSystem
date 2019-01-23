package com.billing.invoice.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.billing.invoice.dao.IssuingPartyMapper;
import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.service.IssuingPartyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext*.xml"})
public class MybatisTest {
	@Autowired
	IssuingPartyMapper issuingPartyMapper;
	@Autowired
	IssuingPartyService issuingPartyService;
	
    @Test
    public void testone(){
    	System.out.println(issuingPartyMapper);
    	IssuingParty issuingParty = new IssuingParty("开票单位1", "地址1", "电话1", "USD", "1231", "银行1", "123");
    	issuingPartyService.insertIssuingParty(issuingParty);
}
}
