package com.babydays.dao;

import com.babydays.model.BHealth;
import com.babydays.model.BHealthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BHealthDao {
    int countByExample(BHealthExample example);

    int deleteByExample(BHealthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BHealth record);

    int insertSelective(BHealth record);

    List<BHealth> selectByExample(BHealthExample example);

    BHealth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BHealth record, @Param("example") BHealthExample example);

    int updateByExample(@Param("record") BHealth record, @Param("example") BHealthExample example);

    int updateByPrimaryKeySelective(BHealth record);

    int updateByPrimaryKey(BHealth record);
}