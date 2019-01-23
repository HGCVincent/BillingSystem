package com.billing.invoice.dao;

import com.billing.invoice.po.CustomerProfile;
import com.billing.invoice.po.CustomerProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerProfileMapper {
    long countByExample(CustomerProfileExample example);

    int deleteByExample(CustomerProfileExample example);

    int insert(CustomerProfile record);

    int insertSelective(CustomerProfile record);

    List<CustomerProfile> selectByExample(CustomerProfileExample example);

    int updateByExampleSelective(@Param("record") CustomerProfile record, @Param("example") CustomerProfileExample example);

    int updateByExample(@Param("record") CustomerProfile record, @Param("example") CustomerProfileExample example);
}