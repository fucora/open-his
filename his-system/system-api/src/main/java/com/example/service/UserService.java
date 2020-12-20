package com.example.service;

import com.example.domain.User;
import com.example.dto.UserDto;
import com.example.vo.DataGridView;

import java.util.List;

/**
 * Author jianghao
 */
public interface UserService {

    /**
     * 根据手机号查询用户
     */
    User queryUserByPhone(String phone);

    /**
     * 根据用户ID查询用户
     */
    User getOne(Long userId);

    /**
     * 分页查询用户
     */
    DataGridView listUserForPage(UserDto userDto);

    /**
     * 添加用户
     */
    int addUser(UserDto userDto);

    /**
     * 修改用户
     */
    int updateUser(UserDto userDto);

    /**
     * 删除用户
     */
    int deleteUserByIds(Long[] userIds);

    /**
     * 重置用户密码
     */
    void resetPassWord(Long[] userIds);

    /**
     * 查询所有可用的用户
     */
    List<User> getAllUsers();

    /**
     * 查询要排班的医生信息
     */
    List<User> queryUsersNeedScheduling(Long userId, Long deptId);

}
