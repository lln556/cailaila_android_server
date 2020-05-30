package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.User;
import com.cai.utils.PostUtils;

public class UserController {
    public static int add(User user){
        String userJson = JSON.toJSONString(user);
        String url = "/user/add";
        JSONObject body = PostUtils.postJson(url, userJson);
        JSONObject data = body.getJSONObject("data");
        User user1 = data.toJavaObject(User.class);
        return user1.getUid();
    }

    public static User update(User user){
        String userJson = JSON.toJSONString(user);
        String url = "/user/update";
        JSONObject body = PostUtils.postJson(url, userJson);
        JSONObject data = body.getJSONObject("data");
        User user1 = data.toJavaObject(User.class);
        return user1;
    }
}
