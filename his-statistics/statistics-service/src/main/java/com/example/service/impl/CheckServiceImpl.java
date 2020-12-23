package com.example.service.impl;

import com.example.domain.Check;
import com.example.domain.CheckStat;
import com.example.dto.CheckQueryDto;
import com.example.mapper.CheckMapper;
import com.example.service.CheckService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author jianghao
 */
@Service
public class CheckServiceImpl implements CheckService {


    @Autowired
    private CheckMapper checkMapper;

    @Override
    public List<Check> queryCheck(CheckQueryDto checkQueryDto) {
        return this.checkMapper.queryCheck(checkQueryDto);
    }

    @Override
    public List<CheckStat> queryCheckStat(CheckQueryDto checkQueryDto) {
        return this.checkMapper.queryCheckStat(checkQueryDto);
    }
}

