package com.pudongdevelopmentbank.community.util;

import com.pudongdevelopmentbank.community.entity.User;
import org.springframework.stereotype.Component;

/***
 *@Description 持有用户信息用于代替session对象
 *@Author:Lihuiming
 *@Date:2022/6/9
 */
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
