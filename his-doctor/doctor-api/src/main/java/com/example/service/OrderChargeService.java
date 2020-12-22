package com.example.service;

import com.example.domain.OrderCharge;
import com.example.domain.OrderChargeItem;
import com.example.dto.OrderChargeDto;
import com.example.dto.OrderChargeFromDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface OrderChargeService {

    /**
     * 保存收费订单及详情
     */
    void saveOrderAndItems(OrderChargeFromDto orderChargeFromDto);

    /**
     * 支付成功之后更新订单状态
     */
    void paySuccess(String orderId, String payPlatformId,String payType);

    /**
     * 根据订单ID查询订单信息
     */
    OrderCharge queryOrderChargeByOrderId(String orderId);

    /**
     * 分页查询所有收费单
     */
    DataGridView queryAllOrderChargeForPage(OrderChargeDto orderChargeDto);

    /**
     * 据收费单的ID查询收费详情信息
     */
    List<OrderChargeItem> queryOrderChargeItemByOrderId(String orderId);

    /**
     * 根据详情ID查询收费订单详情
     */
    OrderChargeItem queryOrderChargeItemByItemId(String itemId);
}

