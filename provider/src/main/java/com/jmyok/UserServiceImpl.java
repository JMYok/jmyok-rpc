package com.jmyok;

import com.jmyok.common.model.User;
import com.jmyok.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("当前用户:"+user.getName());
        return user;
    }
}
