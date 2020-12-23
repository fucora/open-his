package com.example.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.constants.Constants;
import com.example.domain.CareOrderItem;
import com.example.domain.CheckResult;
import com.example.domain.OrderChargeItem;
import com.example.dto.CheckResultDto;
import com.example.dto.CheckResultFormDto;
import com.example.mapper.CareOrderItemMapper;
import com.example.mapper.CheckResultMapper;
import com.example.mapper.OrderChargeItemMapper;
import com.example.service.CheckResultService;
import com.example.vo.DataGridView;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author jianghao
 */
@Service(methods = {@Method(name = "saveCheckResult", retries = 1)})
public class CheckResultServiceImpl implements CheckResultService {

    @Autowired
    private CheckResultMapper checkResultMapper;
    @Autowired
    private OrderChargeItemMapper orderChargeItemMapper;
    @Autowired
    private CareOrderItemMapper careOrderItemMapper;

    @Override
    @Transactional
    public int saveCheckResult(CheckResult checkResult) {
        //直接保存
        int i = checkResultMapper.insert(checkResult);
        //更新收费详情状态
        OrderChargeItem orderChargeItem = new OrderChargeItem();
        orderChargeItem.setItemId(checkResult.getItemId());
        orderChargeItem.setStatus(Constants.ORDER_DETAILS_STATUS_3);//已完成
        orderChargeItemMapper.updateById(orderChargeItem);
        //更新处方详情状态
        CareOrderItem careOrderItem = new CareOrderItem();
        careOrderItem.setItemId(checkResult.getItemId());
        careOrderItem.setStatus(Constants.ORDER_DETAILS_STATUS_3);
        careOrderItemMapper.updateById(careOrderItem);
        return i;
    }

    @Override
    public DataGridView queryAllCheckResultForPage(CheckResultDto checkResultDto) {
        Page<CheckResult> page = new Page<>(checkResultDto.getPageNum(), checkResultDto.getPageSize());
        QueryWrapper<CheckResult> qw = new QueryWrapper<>();
        qw.in(checkResultDto.getCheckItemIds().size() > 0, CheckResult.COL_CHECK_ITEM_ID, checkResultDto.getCheckItemIds());
        qw.like(StringUtils.isNotBlank(checkResultDto.getRegId()), CheckResult.COL_REG_ID, checkResultDto.getRegId());
        qw.like(StringUtils.isNotBlank(checkResultDto.getPatientName()), CheckResult.COL_PATIENT_NAME, checkResultDto.getPatientName());
        qw.eq(StringUtils.isNotBlank(checkResultDto.getResultStatus()), CheckResult.COL_RESULT_STATUS, checkResultDto.getResultStatus());
        this.checkResultMapper.selectPage(page, qw);
        return new DataGridView(page.getTotal(), page.getRecords());
    }

    @Override
    public int completeCheckResult(CheckResultFormDto checkResultFormDto) {
        CheckResult checkResult = new CheckResult();
        BeanUtil.copyProperties(checkResultFormDto, checkResult);
        checkResult.setResultStatus(Constants.RESULT_STATUS_1);//检查完成
        checkResult.setUpdateBy(checkResultFormDto.getSimpleUser().getUserName());
        return this.checkResultMapper.updateById(checkResult);
    }

}
