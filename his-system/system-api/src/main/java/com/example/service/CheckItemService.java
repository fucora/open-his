package com.example.service;

import com.example.domain.CheckItem;
import com.example.dto.CheckItemDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface CheckItemService {

    /**
     * 分页查询
     */
    DataGridView listCheckItemPage(CheckItemDto checkItemDto);

    /**
     * 根据ID查询
     */
    CheckItem getOne(Long checkItemId);

    /**
     * 添加
     */
    int addCheckItem(CheckItemDto checkItemDto);

    /**
     * 修改
     */
    int updateCheckItem(CheckItemDto checkItemDto);

    /**
     * 根据ID删除
     */
    int deleteCheckItemByIds(Long[] checkItemIds);

    /**
     * 查询所有可用的检查项目
     */
    List<CheckItem> selectAllCheckItem();

}

