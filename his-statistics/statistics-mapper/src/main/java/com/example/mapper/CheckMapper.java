package com.example.mapper;

import com.example.domain.Check;
import com.example.domain.CheckStat;
import com.example.dto.CheckQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author jianghao
 */
public interface CheckMapper {
    /**
     * 查询检查项列表
     */
    List<Check> queryCheck(@Param("check") CheckQueryDto checkQueryDto);

    /**
     * 查询检查项统计列表
     */
    List<CheckStat> queryCheckStat(@Param("check") CheckQueryDto checkQueryDto);
}

