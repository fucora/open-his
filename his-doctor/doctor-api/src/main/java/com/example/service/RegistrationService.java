package com.example.service;

import com.example.domain.Registration;
import com.example.dto.RegistrationDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface RegistrationService {

    /**
     * 添加挂号信息
     */
    void addRegistration(RegistrationDto registrationDto);

    /**
     * 根据挂号单ID查询挂号单信息
     */
    Registration queryRegistrationByRegId(String regId);

    /**
     * 根据ID更新挂号单的信息
     */
    int updateRegistrationByRegId(Registration registration);

    /**
     * 分页查询挂号单
     */
    DataGridView queryRegistrationForPage(RegistrationDto registrationDto);

    /**
     * 根据条件查询挂号信息
     */
    List<Registration> queryRegistration(Long deptId, String subsectionType, String scheudlingType, String regStatus, Long userId);
}

