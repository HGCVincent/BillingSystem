package com.billing.invoice.criteria;

public class TaxInvoiceNumCriteria {
    private String taxInvBatch;
    
    private String office;
    
    private String taxInvTyp;

	public String getTaxInvBatch() {
		return taxInvBatch;
	}

	public void setTaxInvBatch(String taxInvBatch) {
		this.taxInvBatch = taxInvBatch;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getTaxInvTyp() {
		return taxInvTyp;
	}

	public void setTaxInvTyp(String taxInvTyp) {
		this.taxInvTyp = taxInvTyp;
	}
}
