package com.example.service.impl;

import com.example.domain.Workload;
import com.example.domain.WorkloadStat;
import com.example.dto.WorkloadQueryDto;
import com.example.mapper.WorkloadMapper;
import com.example.service.WorkloadService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author jianghao
 */
@Service
public class WorkloadServiceImpl implements WorkloadService {


    @Autowired
    private WorkloadMapper workloadMapper;

    @Override
    public List<Workload> queryWorkload(WorkloadQueryDto workloadQueryDto) {
        return this.workloadMapper.queryWorkload(workloadQueryDto);
    }

    @Override
    public List<WorkloadStat> queryWorkloadStat(WorkloadQueryDto workloadQueryDto) {
        return this.workloadMapper.queryWorkloadStat(workloadQueryDto);
    }
}
