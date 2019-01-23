package com.billing.invoice.dao;

import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.po.SystemInvoiceExample;
import com.billing.invoice.po.SystemInvoiceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemInvoiceMapper {
    long countByExample(SystemInvoiceExample example);

    int deleteByExample(SystemInvoiceExample example);

    int deleteByPrimaryKey(SystemInvoiceKey key);

    int insert(SystemInvoice record);

    int insertSelective(SystemInvoice record);

    List<SystemInvoice> selectByExample(SystemInvoiceExample example);

    SystemInvoice selectByPrimaryKey(SystemInvoiceKey key);

    int updateByExampleSelective(@Param("record") SystemInvoice record, @Param("example") SystemInvoiceExample example);

    int updateByExample(@Param("record") SystemInvoice record, @Param("example") SystemInvoiceExample example);

    int updateByPrimaryKeySelective(SystemInvoice record);

    int updateByPrimaryKey(SystemInvoice record);
}