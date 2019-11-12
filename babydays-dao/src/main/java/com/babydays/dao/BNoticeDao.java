package com.babydays.dao;

import com.babydays.model.BNotice;
import com.babydays.model.BNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BNoticeDao {
    int countByExample(BNoticeExample example);

    int deleteByExample(BNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BNotice record);

    int insertSelective(BNotice record);

    List<BNotice> selectByExample(BNoticeExample example);

    BNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BNotice record, @Param("example") BNoticeExample example);

    int updateByExample(@Param("record") BNotice record, @Param("example") BNoticeExample example);

    int updateByPrimaryKeySelective(BNotice record);

    int updateByPrimaryKey(BNotice record);
}