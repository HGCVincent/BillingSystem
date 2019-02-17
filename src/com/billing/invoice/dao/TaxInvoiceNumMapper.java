package com.billing.invoice.dao;

import com.billing.invoice.po.TaxInvoiceNum;
import com.billing.invoice.po.TaxInvoiceNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaxInvoiceNumMapper {
    long countByExample(TaxInvoiceNumExample example);

    int deleteByExample(TaxInvoiceNumExample example);

    int insert(TaxInvoiceNum record);

    int insertSelective(TaxInvoiceNum record);

    List<TaxInvoiceNum> selectByExample(TaxInvoiceNumExample example);

    int updateByExampleSelective(@Param("record") TaxInvoiceNum record, @Param("example") TaxInvoiceNumExample example);

    int updateByExample(@Param("record") TaxInvoiceNum record, @Param("example") TaxInvoiceNumExample example);
}