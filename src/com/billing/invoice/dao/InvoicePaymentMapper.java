package com.billing.invoice.dao;

import com.billing.invoice.po.InvoicePayment;
import com.billing.invoice.po.InvoicePaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoicePaymentMapper {
    long countByExample(InvoicePaymentExample example);

    int deleteByExample(InvoicePaymentExample example);

    int insert(InvoicePayment record);

    int insertSelective(InvoicePayment record);

    List<InvoicePayment> selectByExample(InvoicePaymentExample example);

    int updateByExampleSelective(@Param("record") InvoicePayment record, @Param("example") InvoicePaymentExample example);

    int updateByExample(@Param("record") InvoicePayment record, @Param("example") InvoicePaymentExample example);
}