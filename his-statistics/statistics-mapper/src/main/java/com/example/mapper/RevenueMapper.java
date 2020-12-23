package com.example.mapper;

import com.example.domain.Income;
import com.example.domain.Refund;
import com.example.dto.RevenueQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author jianghao
 */
public interface RevenueMapper {
    /**
     * 查询收入的数据
     */
    List<Income> queryIncome(@Param("revenue") RevenueQueryDto revenueQueryDto);

    /**
     * 查询退费的数据
     */
    List<Refund> queryRefund(@Param("revenue") RevenueQueryDto revenueQueryDto);
}

