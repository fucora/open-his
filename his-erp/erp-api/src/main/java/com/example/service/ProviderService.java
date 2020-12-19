package com.example.service;

import com.example.domain.Provider;
import com.example.dto.ProviderDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface ProviderService {
    /**
     * 分页查询
     */
    DataGridView listProviderPage(ProviderDto providerDto);

    /**
     * 根据ID查询
     */
    Provider getOne(Long providerId);

    /**
     * 添加
     */
    int addProvider(ProviderDto providerDto);

    /**
     * 修改
     */
    int updateProvider(ProviderDto providerDto);

    /**
     * 根据ID删除
     */
    int deleteProviderByIds(Long[] providerIds);

    /**
     * 查询所有可用供应商
     */
    List<Provider> selectAllProvider();

}

