package com.example.service;

import com.example.domain.Dept;
import com.example.dto.DeptDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface DeptService {

    /**
     * 分页查询
     */
    DataGridView listPage(DeptDto deptDto);

    /**
     * 查询所有有效部门
     */
    List<Dept> list();

    /**
     * 根据ID查询一个
     */
    Dept getOne(Long deptId);

    /**
     * 添加一个部门
     */
    int addDept(DeptDto deptDto);

    /**
     * 修改部门
     */
    int updateDept(DeptDto deptDto);

    /**
     * 根据IDS删除部门
     */
    int deleteDeptByIds(Long[] deptIds);

    /**
     * 根据部门ID集合查询部门信息
     */
    List<Dept> listDeptByDeptIds(List<Long> deptIds);

    /**
     * 根据部门ID更新号段
     */
    void updateDeptRegNumber(Long deptId, int i);

}

