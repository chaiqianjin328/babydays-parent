package com.babydays.dao;

import com.babydays.model.BTooth;
import com.babydays.model.BToothExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BToothDao {
    int countByExample(BToothExample example);

    int deleteByExample(BToothExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BTooth record);

    int insertSelective(BTooth record);

    List<BTooth> selectByExample(BToothExample example);

    BTooth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BTooth record, @Param("example") BToothExample example);

    int updateByExample(@Param("record") BTooth record, @Param("example") BToothExample example);

    int updateByPrimaryKeySelective(BTooth record);

    int updateByPrimaryKey(BTooth record);
}