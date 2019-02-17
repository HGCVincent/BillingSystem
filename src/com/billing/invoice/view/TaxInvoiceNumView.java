package com.billing.invoice.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.billing.common.JsonConvertor;
import com.billing.invoice.criteria.TaxInvoiceNumCriteria;
import com.billing.invoice.dto.TaxInvoiceNumDTO;
import com.billing.invoice.po.TaxInvoiceNum;
import com.billing.invoice.service.TaxInvoiceNumService;
import com.github.pagehelper.PageHelper;


public class TaxInvoiceNumView extends BasicView<TaxInvoiceNum> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TaxInvoiceNumService taxInvoiceNumService;
	TaxInvoiceNumCriteria taxInvoiceNumCriteria = new TaxInvoiceNumCriteria();
    List<TaxInvoiceNumDTO> taxInvoiceNumDTO = new ArrayList<TaxInvoiceNumDTO>();
    
	public boolean Search(){
		if (this.getPageNum() == null || this.getPageNum().equals("")) {
			pageNum = "1";
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 3);
    	records = this.getTaxInvoiceNumService().getAllTaxInvoiceNumsByCriteria(taxInvoiceNumCriteria);
        for (TaxInvoiceNum i : records) {
			int remainNum=0;
			if (i.getIsRepeat().equals("N")) {
				List<TaxInvoiceNum> list = taxInvoiceNumService.searchTaxInvoiceListByTaxFromAndTo(i.getTaxInvBatch(), i.getTaxFrom(), i.getTaxTo());
				for (TaxInvoiceNum j : list) {
					if (j.getIsUsed().equals("N")) {
					     remainNum++;
					}
				}
				TaxInvoiceNumDTO dto = new TaxInvoiceNumDTO();
				dto.setRemainNum(String.valueOf(remainNum));
				dto.convertTaxNumToTaxNumDto(dto, i);
				taxInvoiceNumDTO.add(dto);
			}
		}
    	return true;
    }

	public String createTaxInvNum(String jsonTaxInvNum){
		TaxInvoiceNum createTaxInvoiceNum = JsonConvertor.convertToObject(jsonTaxInvNum, TaxInvoiceNum.class);
		int from = createTaxInvoiceNum.getTaxFrom();
		int to = createTaxInvoiceNum.getTaxTo();
		for (int i = from; i <= to; i++) {
			createTaxInvoiceNum.setInvId((long)i);
			createTaxInvoiceNum.setInvIdStatus("Active");
			createTaxInvoiceNum.setIsUsed("N");
			createTaxInvoiceNum.setTaxFrom(from);
			createTaxInvoiceNum.setTaxTo(to);
			createTaxInvoiceNum.setModifyDate(new Date());
			if (i==from){
				createTaxInvoiceNum.setIsRepeat("N");
            }
            else {
            	createTaxInvoiceNum.setIsRepeat("Y");
            }
			this.getTaxInvoiceNumService().addTaxInvoiceNum(createTaxInvoiceNum);
		}
		return "Y";
	}
	
	public TaxInvoiceNumService getTaxInvoiceNumService() {
		return taxInvoiceNumService;
	}

	public void setTaxInvoiceNumService(TaxInvoiceNumService taxInvoiceNumService) {
		this.taxInvoiceNumService = taxInvoiceNumService;
	}

	public TaxInvoiceNumCriteria getTaxInvoiceNumCriteria() {
		return taxInvoiceNumCriteria;
	}

	public void setTaxInvoiceNumCriteria(TaxInvoiceNumCriteria taxInvoiceNumCriteria) {
		this.taxInvoiceNumCriteria = taxInvoiceNumCriteria;
	}

	public List<TaxInvoiceNumDTO> getTaxInvoiceNumDTO() {
		return taxInvoiceNumDTO;
	}

	public void setTaxInvoiceNumDTO(List<TaxInvoiceNumDTO> taxInvoiceNumDTO) {
		this.taxInvoiceNumDTO = taxInvoiceNumDTO;
	}

    
}
