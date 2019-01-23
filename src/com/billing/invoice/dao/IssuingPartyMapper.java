package com.billing.invoice.dao;

import com.billing.invoice.po.IssuingParty;
import com.billing.invoice.po.IssuingPartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssuingPartyMapper {
    long countByExample(IssuingPartyExample example);

    int deleteByExample(IssuingPartyExample example);

    int insert(IssuingParty record);

    int insertSelective(IssuingParty record);

    List<IssuingParty> selectByExample(IssuingPartyExample example);

    int updateByExampleSelective(@Param("record") IssuingParty record, @Param("example") IssuingPartyExample example);

    int updateByExample(@Param("record") IssuingParty record, @Param("example") IssuingPartyExample example);
}