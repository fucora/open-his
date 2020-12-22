package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Medicines;
import org.apache.ibatis.annotations.Param;

public interface MedicinesMapper extends BaseMapper<Medicines> {

    /**
     * 扣减库存
     */
    int deductionMedicinesStorage(@Param("medicinesId") Long medicinesId, @Param("num") long num);

}