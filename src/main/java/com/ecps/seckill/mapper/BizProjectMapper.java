package com.ecps.seckill.mapper;

import com.ecps.seckill.pojo.BizProject;
import com.ecps.seckill.pojo.BizProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizProjectMapper {
    long countByExample(BizProjectExample example);

    int deleteByExample(BizProjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(BizProject record);

    int insertSelective(BizProject record);

    List<BizProject> selectByExample(BizProjectExample example);

    BizProject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BizProject record, @Param("example") BizProjectExample example);

    int updateByExample(@Param("record") BizProject record, @Param("example") BizProjectExample example);

    int updateByPrimaryKeySelective(BizProject record);

    int updateByPrimaryKey(BizProject record);
}