package com.babydays.dao;

import com.babydays.model.BGarden;
import com.babydays.model.BGardenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGardenDao {
    int countByExample(BGardenExample example);

    int deleteByExample(BGardenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGarden record);

    int insertSelective(BGarden record);

    List<BGarden> selectByExample(BGardenExample example);

    BGarden selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGarden record, @Param("example") BGardenExample example);

    int updateByExample(@Param("record") BGarden record, @Param("example") BGardenExample example);

    int updateByPrimaryKeySelective(BGarden record);

    int updateByPrimaryKey(BGarden record);
}