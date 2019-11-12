package com.babydays.dao;

import com.babydays.model.BSignin;
import com.babydays.model.BSigninExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSigninDao {
    int countByExample(BSigninExample example);

    int deleteByExample(BSigninExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSignin record);

    int insertSelective(BSignin record);

    List<BSignin> selectByExample(BSigninExample example);

    BSignin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSignin record, @Param("example") BSigninExample example);

    int updateByExample(@Param("record") BSignin record, @Param("example") BSigninExample example);

    int updateByPrimaryKeySelective(BSignin record);

    int updateByPrimaryKey(BSignin record);
    
    List<BSignin> selectBySiginSelective(BSignin record);

	List<BSignin> selectStudentSigninBySiginSelective(BSignin record);
    
    
}