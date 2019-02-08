package com.billing.invoice.dao;

import java.util.List;

import com.billing.invoice.po.SystemInvoice;
import com.billing.invoice.po.SystemInvoiceExample;

public interface SystemInvoiceMapperCustom {
    int getMaxSeqId();
    
    List<SystemInvoice> selectByExamplePlus(SystemInvoiceExample systemInvoiceExample);
}
