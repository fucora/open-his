package com.example.service;

import com.example.domain.Scheduling;
import com.example.dto.SchedulingFormDto;
import com.example.dto.SchedulingQueryDto;

import java.util.List;

/**
 * Author jianghao
 */

public interface SchedulingService{

    /**
     * 查询排班数据
     */
    List<Scheduling> queryScheduling(SchedulingQueryDto schedulingQueryDto);

    /**
     * 保存排班数据
     */
    int saveScheduling(SchedulingFormDto schedulingFormDto);

    /**
     * 根据条件查询有号的部门编号
     */
    List<Long> queryHasSchedulingDeptIds(Long deptId, String schedulingDay, String schedulingType, String subsectionType);
}

