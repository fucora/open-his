package com.example.service;

import com.example.domain.Purchase;
import com.example.domain.PurchaseItem;
import com.example.domain.SimpleUser;
import com.example.dto.PurchaseDto;
import com.example.dto.PurchaseFormDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */

public interface PurchaseService {

    /**
     * 分页查询
     */
    DataGridView listPurchasePage(PurchaseDto purchaseDto);

    /**
     * 根据采购单据号查询单据信息
     */
    Purchase getPurchaseById(String purchaseId);

    /**
     * 提交 审核
     */
    int doAudit(String purchaseId, SimpleUser simpleUser);

    /**
     * 作废
     */
    int doInvalid(String purchaseId);

    /**
     * 审核通过
     */
    int auditPass(String purchaseId);

    /**
     * 审核不通过
     */
    int auditNoPass(String purchaseId,String auditMsg);

    /**
     * 根据ID查询一个采购信息详情
     */
    List<PurchaseItem> getPurchaseItemById(String purchaseId);

    /**
     * 暂存采购单数据和详情
     */
    int addPurchaseAndItem(PurchaseFormDto purchaseFormDto);

    /**
     * 保存并提交审核采购单数据和详情
     */
    int addPurchaseAndItemToAudit(PurchaseFormDto purchaseFormDto);

    /**
     * 保存并提交审核采购单数据和详情
     */
    int doInventory(String purchaseId, SimpleUser currentSimpleUser);
}

