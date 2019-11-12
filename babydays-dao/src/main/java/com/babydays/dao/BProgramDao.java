package com.babydays.dao;

import com.babydays.model.BProgram;
import com.babydays.model.BProgramExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BProgramDao {
    int countByExample(BProgramExample example);

    int deleteByExample(BProgramExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BProgram record);

    int insertSelective(BProgram record);

    List<BProgram> selectByExample(BProgramExample example);

    BProgram selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BProgram record, @Param("example") BProgramExample example);

    int updateByExample(@Param("record") BProgram record, @Param("example") BProgramExample example);

    int updateByPrimaryKeySelective(BProgram record);

    int updateByPrimaryKey(BProgram record);
}