package com.example.service;

import com.example.domain.RegisteredItem;
import com.example.dto.RegisteredItemDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */

public interface RegisteredItemService {
    /**
     * 分页查询
     */
    DataGridView listRegisteredItemPage(RegisteredItemDto registeredItemDto);

    /**
     * 根据ID查询
     */
    RegisteredItem getOne(Long registeredItemId);

    /**
     * 添加
     */
    int addRegisteredItem(RegisteredItemDto registeredItemDto);

    /**
     * 修改
     */
    int updateRegisteredItem(RegisteredItemDto registeredItemDto);

    /**
     * 根据ID删除
     */
    int deleteRegisteredItemByIds(Long[] registeredItemIds);

    /**
     * 查询所有可用的检查项目
     */
    List<RegisteredItem> selectAllRegisteredItem();

}

