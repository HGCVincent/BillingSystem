package com.billing.common;

import java.util.ArrayList;
import java.util.List;

public class Currency {
    List<String> currencyList = new ArrayList<String>();

    
	public Currency() {
		currencyList.add("USD");
		currencyList.add("CNY");
	}


	public List<String> getCurrencyList() {
		return currencyList;
	}


	public void setCurrencyList(List<String> currencyList) {
		this.currencyList = currencyList;
	}

	
    
    
}
