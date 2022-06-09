package com.pudongdevelopmentbank.community.service;

import com.pudongdevelopmentbank.community.entity.User;

import java.util.Map;

/***
 *@Description TODO
 *@Author:Lihuiming
 *@Date:2022/6/9
 */
public interface UserService {

    User findUserById(int id);

    Map<String, Object> register(User user);

    int activation(int userId, String code);

    Map<String, Object> login(String username, String password, int expiredSeconds);

    void logout(String ticket);
}
