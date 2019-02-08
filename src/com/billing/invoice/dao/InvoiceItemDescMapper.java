package com.billing.invoice.dao;

import com.billing.invoice.po.InvoiceItemDesc;
import com.billing.invoice.po.InvoiceItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceItemDescMapper {
    long countByExample(InvoiceItemDescExample example);

    int deleteByExample(InvoiceItemDescExample example);

    int insert(InvoiceItemDesc record);

    int insertSelective(InvoiceItemDesc record);

    List<InvoiceItemDesc> selectByExample(InvoiceItemDescExample example);

    int updateByExampleSelective(@Param("record") InvoiceItemDesc record, @Param("example") InvoiceItemDescExample example);

    int updateByExample(@Param("record") InvoiceItemDesc record, @Param("example") InvoiceItemDescExample example);
}