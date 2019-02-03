package com.billing.invoice.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.billing.invoice.dao.CustomerProfileMapper;
import com.billing.invoice.po.CustomerProfile;
import com.billing.invoice.po.CustomerProfileExample;
import com.billing.invoice.po.CustomerProfileExample.Criteria;

public class CustomerProfileServiceImpl implements CustomerProfileService{
    @Autowired
	CustomerProfileMapper customerProfileMapper;
    CustomerProfileExample customerProfileExample;

    public void setCustomerProfileExample(CustomerProfileExample customerProfileExample) {
		this.customerProfileExample = customerProfileExample;
	}
	
	public CustomerProfileExample getCustomerProfileExample() {
		if (null == customerProfileExample) {
			return new CustomerProfileExample();
		}
		return customerProfileExample;
	}
    
    @Override
	public List<CustomerProfile> getCustomerProfileById(CustomerProfile customerProfileCriteria) {
    	CustomerProfileExample customerProfileExample = this.getCustomerProfileExample();
		Criteria criteria = customerProfileExample.createCriteria();
		if (StringUtils.isNoneEmpty(customerProfileCriteria.getCustId())) {
			criteria.andCustIdEqualTo(customerProfileCriteria.getCustId());
		}
		List<CustomerProfile> customerProfiles = customerProfileMapper.selectByExample(customerProfileExample);
		return customerProfiles;
	}

	@Override
	public CustomerProfile getCustomerProfileById(String id) {
		CustomerProfileExample customerProfileExample = this.getCustomerProfileExample();
		Criteria criteria = customerProfileExample.createCriteria();
	    criteria.andCustIdEqualTo(id);
		return customerProfileMapper.selectByExample(customerProfileExample).get(0);
	}

	@Override
	public void deleteCustomerProfileById(String id) {
		CustomerProfileExample customerProfileExample = this.getCustomerProfileExample();
		Criteria criteria = customerProfileExample.createCriteria();
	    criteria.andCustIdEqualTo(id);
	    customerProfileMapper.deleteByExample(customerProfileExample);
	}
}
