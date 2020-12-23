package com.example.service.impl;

import com.example.domain.Drug;
import com.example.domain.DrugStat;
import com.example.dto.DrugQueryDto;
import com.example.mapper.DrugMapper;
import com.example.service.DrugService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author jianghao
 */
@Service
public class DrugServiceImpl implements DrugService {


    @Autowired
    private DrugMapper drugMapper;

    @Override
    public List<Drug> queryDrug(DrugQueryDto drugQueryDto) {
        return this.drugMapper.queryDrug(drugQueryDto);
    }

    @Override
    public List<DrugStat> queryDrugStat(DrugQueryDto drugQueryDto) {
        return this.drugMapper.queryDrugStat(drugQueryDto);
    }
}

