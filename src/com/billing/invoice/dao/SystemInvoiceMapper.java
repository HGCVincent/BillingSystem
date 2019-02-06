package com.billing.invoice.dao;

import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.po.SystemInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemInvoiceMapper {
    long countByExample(SystemInvoiceExample example);

    int deleteByExample(SystemInvoiceExample example);

    int insert(SystemInvoice record);

    int insertSelective(SystemInvoice record);

    List<SystemInvoice> selectByExample(SystemInvoiceExample example);

    int updateByExampleSelective(@Param("record") SystemInvoice record, @Param("example") SystemInvoiceExample example);

    int updateByExample(@Param("record") SystemInvoice record, @Param("example") SystemInvoiceExample example);
}