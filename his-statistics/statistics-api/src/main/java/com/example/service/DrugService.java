package com.example.service;

import com.example.domain.Drug;
import com.example.domain.DrugStat;
import com.example.dto.DrugQueryDto;

import java.util.List;

/**
 * Author jianghao
 */
public interface DrugService {
    /**
     * 查询发药统计列表
     */
    List<Drug> queryDrug(DrugQueryDto drugQueryDto);

    /**
     * 查询发药数量统计列表
     */
    List<DrugStat> queryDrugStat(DrugQueryDto drugQueryDto);
}

