package com.example.service;

import com.example.domain.OrderBackfeeItem;
import com.example.dto.OrderBackfeeDto;
import com.example.dto.OrderBackfeeFormDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 * 退费接口
 */
public interface OrderBackfeeService {

    /**
     * 保存退费单
     */
    void saveOrderAndItems(OrderBackfeeFormDto orderBackfeeFormDto);

    /**
     * 退费成功之后更改状态
     */
    void backSuccess(String backId, String backPlatformId, String backType);

    /**
     * 分页查询所有退费单
     */
    DataGridView queryAllOrderBackfeeForPage(OrderBackfeeDto orderBackfeeDto);

    /**
     * 根据退费单的ID查询退费详情信息
     */
    List<OrderBackfeeItem> queryrderBackfeeItemByBackId(String backId);
}

