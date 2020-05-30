package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.cai.model.User;
import org.junit.Before;
import org.junit.Test;

public class UserControllerTest {
    User user;

    /**
     * 所有case的测试样例
     */
    @Before
    public void before(){
        user = new User();
        user.setGid(1);
        user.setNickname("小红");
        user.setUsertel("13670000000");
        user.setBalance((float) 0);
        user.setEmail("123@qq.com");
    }

    @Test
    public void addUser() {
        System.out.println(JSON.toJSONString(user));
        int uid = UserController.add(user);
        System.out.println("新增用户id：" + uid);
    }
    @Test
    public void updateUser(){
        user.setUid(4);
        User user1 = UserController.update(user);
        System.out.println(JSON.toJSONString(user1));
    }
}