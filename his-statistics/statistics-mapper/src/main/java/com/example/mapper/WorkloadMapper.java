package com.example.mapper;

import com.example.domain.Workload;
import com.example.domain.WorkloadStat;
import com.example.dto.WorkloadQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author jianghao
 */
public interface WorkloadMapper {
    /**
     * 医生工作量统计列表
     */
    List<Workload> queryWorkload(@Param("workload") WorkloadQueryDto workloadQueryDto);

    /**
     * 总体工作量统计列表
     */
    List<WorkloadStat> queryWorkloadStat(@Param("workload") WorkloadQueryDto workloadQueryDto);
}

