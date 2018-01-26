package com.ecps.seckill.mapper;

import com.ecps.seckill.pojo.BizProjectDetail;
import com.ecps.seckill.pojo.BizProjectDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizProjectDetailMapper {
    long countByExample(BizProjectDetailExample example);

    int deleteByExample(BizProjectDetailExample example);

    int deleteByPrimaryKey(String projectId);

    int insert(BizProjectDetail record);

    int insertSelective(BizProjectDetail record);

    List<BizProjectDetail> selectByExampleWithBLOBs(BizProjectDetailExample example);

    List<BizProjectDetail> selectByExample(BizProjectDetailExample example);

    BizProjectDetail selectByPrimaryKey(String projectId);

    int updateByExampleSelective(@Param("record") BizProjectDetail record, @Param("example") BizProjectDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") BizProjectDetail record, @Param("example") BizProjectDetailExample example);

    int updateByExample(@Param("record") BizProjectDetail record, @Param("example") BizProjectDetailExample example);

    int updateByPrimaryKeySelective(BizProjectDetail record);

    int updateByPrimaryKeyWithBLOBs(BizProjectDetail record);

    int updateByPrimaryKey(BizProjectDetail record);
}