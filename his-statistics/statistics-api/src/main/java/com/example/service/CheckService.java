package com.example.service;

import com.example.domain.Check;
import com.example.domain.CheckStat;
import com.example.dto.CheckQueryDto;

import java.util.List;

/**
 * @Author: 尚学堂 雷哥
 */
public interface CheckService {
    /**
     * 查询检查项列表
     * @param checkQueryDto
     * @return
     */
    List<Check> queryCheck(CheckQueryDto checkQueryDto);

    /**
     * 查询检查项统计列表
     * @param checkQueryDto
     * @return
     */
    List<CheckStat> queryCheckStat(CheckQueryDto checkQueryDto);
}

