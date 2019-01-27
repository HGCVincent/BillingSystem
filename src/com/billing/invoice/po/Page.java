package com.billing.invoice.po;

import com.github.pagehelper.PageInfo;

public class Page {
	int currentPage;
    long totalRecords;
    int totalPages;
    int[] pageNums;   //页面连续显示页码
    boolean isLastPage;
    boolean isFristPage;
    int startRow;     //起始行
    int endRow;       //末行
    
    
    
	public Page() {
		super();
	}
	
	public <T> Page(PageInfo<T> pageInfo){
		currentPage = pageInfo.getPageNum();
        totalRecords =pageInfo.getTotal();
        totalPages = pageInfo.getPages();
        isLastPage = pageInfo.isIsLastPage();
        pageNums = pageInfo.getNavigatepageNums(); 
        isFristPage = pageInfo.isIsFirstPage();
        startRow = pageInfo.getStartRow();
        endRow = pageInfo.getEndRow();
	}
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int[] getPageNums() {
		return pageNums;
	}

	public void setPageNums(int[] pageNums) {
		this.pageNums = pageNums;
	}

	public boolean getIsLastPage() {
		return isLastPage;
	}

	public void setIsLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public boolean getIsFristPage() {
		return isFristPage;
	}

	public void setIsFristPage(boolean isFristPage) {
		this.isFristPage = isFristPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	

	

	

        
    
}
