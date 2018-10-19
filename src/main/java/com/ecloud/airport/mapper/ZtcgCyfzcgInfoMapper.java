package com.ecloud.airport.mapper;

import com.ecloud.airport.entity.ZtcgCyfzcgInfo;
import com.ecloud.airport.entity.ZtcgCyfzcgInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZtcgCyfzcgInfoMapper {
    long countByExample(ZtcgCyfzcgInfoExample example);

    int deleteByExample(ZtcgCyfzcgInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZtcgCyfzcgInfo record);

    int insertSelective(ZtcgCyfzcgInfo record);

    List<ZtcgCyfzcgInfo> selectByExample(ZtcgCyfzcgInfoExample example);

    ZtcgCyfzcgInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZtcgCyfzcgInfo record, @Param("example") ZtcgCyfzcgInfoExample example);

    int updateByExample(@Param("record") ZtcgCyfzcgInfo record, @Param("example") ZtcgCyfzcgInfoExample example);

    int updateByPrimaryKeySelective(ZtcgCyfzcgInfo record);

    int updateByPrimaryKey(ZtcgCyfzcgInfo record);
}