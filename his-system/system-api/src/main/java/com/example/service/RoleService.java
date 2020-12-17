package com.example.service;

import com.example.domain.Role;
import com.example.dto.RoleDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface RoleService {

    /**
     * 分页查询角色
     */
    DataGridView listRolePage(RoleDto roleDto);

    /**
     * 查询所有可用角色
     */
    List<Role> listAllRoles();

    /**
     * 根据ID查询角色
     */
    Role getOne(Long roleId);

    /**
     * 添加一个角色
     */
    int addRole(RoleDto roleDto);

    /**
     * 修改角色
     */
    int updateRole(RoleDto roleDto);

    /**
     * 根据角色ID删除角色
     */
    int deleteRoleByIds(Long[] roleIds);

    /**
     * 保存角色和菜单之间的关系
     */
    void saveRoleMenu(Long roleId, Long[] menuIds);

    /**
     * 根据用户ID查询用户拥有的角色IDS
     */
    List<Long> getRoleIdsByUserId(Long userId);

    /**
     * 保存角色和用户之间的关系
     */
    void saveRoleUser(Long userId, Long[] roleIds);

}
