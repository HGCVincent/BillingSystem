package com.billing.invoice.view;

import org.apache.commons.lang3.StringUtils;

import com.billing.common.JsonConvertor;
import com.billing.invoice.po.AccountInfo;
import com.billing.invoice.po.CustomerProfile;
import com.billing.invoice.service.CustomerProfileService;
import com.github.pagehelper.PageHelper;

public class CustomerProfileView extends BasicView<CustomerProfile>{
	private static final long serialVersionUID = 1L;
	CustomerProfileService customerProfileService;
    CustomerProfile customerProfileCriteria = new CustomerProfile();
    
    public boolean Search(){
    	if (StringUtils.isEmpty(this.getPageNum())) {
			pageNum = "1";
		}
    	PageHelper.startPage(Integer.valueOf(pageNum), 3);
    	records = this.getCustomerProfileService().getCustomerProfileById(customerProfileCriteria);
    	return true;
    }

    public CustomerProfile getCustomerProfileById(String id){
		return this.getCustomerProfileService().getCustomerProfileById(id);
	}
    
    public void deleteCustomerProfileById(String id){
    	this.getCustomerProfileService().deleteCustomerProfileById(id);
    }
    
    public String saveCustomerProfile(String jsonCustomerProfileStr,boolean isUpdate){
    	CustomerProfile convertToObject = JsonConvertor.convertToObject(jsonCustomerProfileStr, CustomerProfile.class);
    	if(isUpdate){
    	    this.getCustomerProfileService().updateCustomerProfile(convertToObject);
    	}
    	else {
			this.getCustomerProfileService().insertCustomerProfile(convertToObject);
		}
    	return "Y";
    }
    
    
//-------------------------------------------------------------------------------------    
	public CustomerProfileService getCustomerProfileService() {
		return customerProfileService;
	}

	public void setCustomerProfileService(CustomerProfileService customerProfileService) {
		this.customerProfileService = customerProfileService;
	}

	public CustomerProfile getCustomerProfileCriteria() {
		return customerProfileCriteria;
	}

	public void setCustomerProfileCriteria(CustomerProfile customerProfileCriteria) {
		this.customerProfileCriteria = customerProfileCriteria;
	}
	
	
    
    
}
