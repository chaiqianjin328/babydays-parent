package com.babydays.dao;

import com.babydays.model.BDirector;
import com.babydays.model.BDirectorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BDirectorDao {
    int countByExample(BDirectorExample example);

    int deleteByExample(BDirectorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BDirector record);

    int insertSelective(BDirector record);

    List<BDirector> selectByExample(BDirectorExample example);

    BDirector selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BDirector record, @Param("example") BDirectorExample example);

    int updateByExample(@Param("record") BDirector record, @Param("example") BDirectorExample example);

    int updateByPrimaryKeySelective(BDirector record);

    int updateByPrimaryKey(BDirector record);
}