package com.example.service;

import com.example.domain.Patient;
import com.example.domain.PatientFile;
import com.example.dto.PatientDto;
import com.example.vo.DataGridView;

/**
 * Author jianghao
 */
public interface PatientService {

    /**
     * 分页查询
     */
    DataGridView listPatientForPage(PatientDto patientDto);

    /**
     * 根据患者ID查询患者信息
     */
    Patient getPatientById(String patientId);

    /**
     * 根据患者ID查询患者档案信息
     */
    PatientFile getPatientFileById(String patientId);

    /**
     * 根据身份证号查询患者信息
     */
    Patient getPatientByIdCard(String idCard);

    /**
     * 添加患者
     */
    Patient addPatient(PatientDto patientDto);

}

