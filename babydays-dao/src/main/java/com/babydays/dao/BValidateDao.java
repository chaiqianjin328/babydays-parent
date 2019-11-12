package com.babydays.dao;

import com.babydays.model.BValidate;
import com.babydays.model.BValidateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BValidateDao {
    int countByExample(BValidateExample example);

    int deleteByExample(BValidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BValidate record);

    int insertSelective(BValidate record);

    List<BValidate> selectByExample(BValidateExample example);

    BValidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BValidate record, @Param("example") BValidateExample example);

    int updateByExample(@Param("record") BValidate record, @Param("example") BValidateExample example);

    int updateByPrimaryKeySelective(BValidate record);

    int updateByPrimaryKey(BValidate record);
}