package com.billing.invoice.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.billing.common.Page;
import com.github.pagehelper.PageInfo;

public abstract class BasicView<T> implements Serializable {
    public List<T> records = new ArrayList<T>();
    public Page page;
    public String pageNum;            //前台要打开的页码
    public boolean searched;
 

	public void doSearch(){
    	searched = Search();
        PageInfo<T> pageInfo =new PageInfo<T>(records);
        page = new Page(pageInfo);
    }
    
    public boolean Search(){
    	return false;
    }

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}
    
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getPageNum() {
		if (pageNum != null) {
			return pageNum;
		}
		return null;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public boolean getSearched() {
		return searched;
	}

	public void setSearched(boolean searched) {
		this.searched = searched;
	}
	
	
	
}
