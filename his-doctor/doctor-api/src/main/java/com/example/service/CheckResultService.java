package com.example.service;

import com.example.domain.CheckResult;
import com.example.dto.CheckResultDto;
import com.example.dto.CheckResultFormDto;
import com.example.vo.DataGridView;

/**
 * Author jianghao
 * 检查项目的接口
 */
public interface CheckResultService {
    /**
     * 保存检查的检查项目
     */
    int saveCheckResult(CheckResult checkResult);

    /**
     * 分页查询所有检查的项目
     */
    DataGridView queryAllCheckResultForPage(CheckResultDto checkResultDto);

    /**
     * 完成检查
     */
    int completeCheckResult(CheckResultFormDto checkResultFormDto);
}

