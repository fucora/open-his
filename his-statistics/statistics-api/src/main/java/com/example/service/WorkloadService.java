package com.example.service;

import com.example.domain.Workload;
import com.example.domain.WorkloadStat;
import com.example.dto.WorkloadQueryDto;

import java.util.List;

/**
 * @Author: 尚学堂 雷哥
 */
public interface WorkloadService {
    /**
     * 医生工作量统计列表
     * @param workloadQueryDto
     * @return
     */
    List<Workload> queryWorkload(WorkloadQueryDto workloadQueryDto);

    /**
     * 总体工作量统计列表
     * @param workloadQueryDto
     * @return
     */
    List<WorkloadStat> queryWorkloadStat(WorkloadQueryDto workloadQueryDto);
}

