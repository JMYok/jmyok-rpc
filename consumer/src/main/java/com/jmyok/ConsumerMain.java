package com.jmyok;

import com.jmyok.common.model.User;
import com.jmyok.common.service.UserService;

public class ConsumerMain {

    public static void main(String[] args) {
        User user = new User();
        UserService userService=null;
        user.setName("jmyok");
        // rpc provider中的getUser方法
        User newUser = userService.getUser(user);
        if (newUser!=null){
            System.out.println("user:"+newUser);
        }else{
            System.out.println("user==null");
        }
    }
}
