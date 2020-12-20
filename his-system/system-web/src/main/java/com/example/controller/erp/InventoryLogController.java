package com.example.controller.erp;

import com.example.controller.BaseController;
import com.example.dto.InventoryLogDto;
import com.example.service.InventoryLogService;
import com.example.vo.AjaxResult;
import com.example.vo.DataGridView;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/**
 * Auther jianghao
 * 入库记录控制器
 */
@RestController
@RequestMapping("/erp/inventoryLog")
public class InventoryLogController extends BaseController {

    @Reference//使用dubbo的引用
    private InventoryLogService inventoryLogService;

    /**
     * 分页查询
     */
    @GetMapping("/listInventoryLogForPage")
    @HystrixCommand
    public AjaxResult listMedicinesForPage(InventoryLogDto inventoryLogDto){
        DataGridView gridView = this.inventoryLogService.listInventoryLogPage(inventoryLogDto);
        return AjaxResult.success("查询成功",gridView.getData(),gridView.getTotal());
    }

}

