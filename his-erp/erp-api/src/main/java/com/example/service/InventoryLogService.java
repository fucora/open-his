package com.example.service;

import com.example.dto.InventoryLogDto;
import com.example.vo.DataGridView;

/**
 * Author jianghao
 */
public interface InventoryLogService {
    /**
     * 分页查询
     *
     * @param inventoryLogDto
     * @return
     */
    DataGridView listInventoryLogPage(InventoryLogDto inventoryLogDto);
}

