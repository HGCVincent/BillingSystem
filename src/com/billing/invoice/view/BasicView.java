package com.billing.invoice.view;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public abstract class BasicView {
    List<Object> records = new ArrayList<Object>(); 
    int currentPage;
    
    public void doSearch(){
    	Search();
    	PageHelper.startPage(1, 30);
        PageInfo page =new PageInfo(records);
    }
    
    public void Search(){
    }
}
