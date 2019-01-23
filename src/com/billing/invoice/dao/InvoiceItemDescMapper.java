package com.billing.invoice.dao;

import com.billing.invoice.po.InvoiceItemDesc;
import com.billing.invoice.po.InvoiceItemDescExample;
import com.billing.invoice.po.InvoiceItemDescKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceItemDescMapper {
    long countByExample(InvoiceItemDescExample example);

    int deleteByExample(InvoiceItemDescExample example);

    int deleteByPrimaryKey(InvoiceItemDescKey key);

    int insert(InvoiceItemDesc record);

    int insertSelective(InvoiceItemDesc record);

    List<InvoiceItemDesc> selectByExample(InvoiceItemDescExample example);

    InvoiceItemDesc selectByPrimaryKey(InvoiceItemDescKey key);

    int updateByExampleSelective(@Param("record") InvoiceItemDesc record, @Param("example") InvoiceItemDescExample example);

    int updateByExample(@Param("record") InvoiceItemDesc record, @Param("example") InvoiceItemDescExample example);

    int updateByPrimaryKeySelective(InvoiceItemDesc record);

    int updateByPrimaryKey(InvoiceItemDesc record);
}