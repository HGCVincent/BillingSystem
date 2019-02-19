package com.billing.invoice.service;

import java.util.List;

import com.billing.invoice.po.CustomerProfile;

public interface CustomerProfileService {

	List<CustomerProfile> getCustomerProfileById(CustomerProfile customerProfileCriteria);

	CustomerProfile getCustomerProfileById(String id);

	void deleteCustomerProfileById(String id);

	void updateCustomerProfile(CustomerProfile convertToObject);

	void insertCustomerProfile(CustomerProfile convertToObject);

	int getAccountIdByCustId(String custId);

}
