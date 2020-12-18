package com.example.service;

import com.example.domain.Producter;
import com.example.dto.ProducterDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface ProducterService {

    /**
     * 分页查询
     */
    DataGridView listProducterPage(ProducterDto producterDto);

    /**
     * 根据ID查询
     */
    Producter getOne(Long producterId);

    /**
     * 添加
     */
    int addProducter(ProducterDto producterDto);

    /**
     * 修改
     */
    int updateProducter(ProducterDto producterDto);

    /**
     * 根据ID删除
     */
    int deleteProducterByIds(Long[] producterIds);

    /**
     * 查询所有可用生产厂家
     */
    List<Producter> selectAllProducter();

}

