package com.example.mapper;

import com.example.domain.Drug;
import com.example.domain.DrugStat;
import com.example.dto.DrugQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author jianghao
 */
public interface DrugMapper {
    /**
     * 药品统计列表
     */
    List<Drug> queryDrug(@Param("drug") DrugQueryDto drugQueryDto);

    /**
     * 药品数量统计列表
     */
    List<DrugStat> queryDrugStat(@Param("drug") DrugQueryDto drugQueryDto);
}

