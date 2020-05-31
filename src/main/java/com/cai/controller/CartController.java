package com.cai.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.Cart;
import com.cai.utils.PostUtils;
import okhttp3.FormBody;

import java.util.List;

public class CartController {
    public static List<Cart> list(int uid){
        String url = "/cart/list";
        FormBody.Builder param = new FormBody.Builder();
        param.add("uid", "" + uid);
        JSONObject body = PostUtils.postParam(url,param);
        JSONArray list = body.getJSONArray("data");
        return list.toJavaList(Cart.class);
    }

}
