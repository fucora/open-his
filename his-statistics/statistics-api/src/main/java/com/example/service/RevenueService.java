package com.example.service;

import com.example.dto.RevenueQueryDto;

import java.util.Map;

/**
 * Author jianghao
 */
public interface RevenueService {
    /**
     * 查询收支统计的数据
     */
    Map<String, Object> queryAllRevenueData(RevenueQueryDto revenueQueryDto);
}

