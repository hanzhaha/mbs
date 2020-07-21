package com.hanz.dao.mbs;

import com.hanz.domain.mbs.S9supplier;

public interface S9supplierMapper {
    int deleteByPrimaryKey(Integer pgsId);

    int insert(S9supplier record);

    int insertSelective(S9supplier record);

    S9supplier selectByPrimaryKey(Integer pgsId);

    int updateByPrimaryKeySelective(S9supplier record);

    int updateByPrimaryKey(S9supplier record);
}