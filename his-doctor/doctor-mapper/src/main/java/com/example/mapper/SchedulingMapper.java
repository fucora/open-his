package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Scheduling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author jianghao
 */
public interface SchedulingMapper extends BaseMapper<Scheduling> {

    /**
     * 根据条件查询有号的部门编号
     */
    List<Long> queryHasSchedulingDeptIds(@Param("deptId") Long deptId, @Param("schedulingDay") String schedulingDay, @Param("schedulingType") String schedulingType, @Param("subsectionType") String subsectionType);

}