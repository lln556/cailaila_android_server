package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.Cart;
import com.cai.model.Product;
import com.cai.utils.PostUtils;
import okhttp3.FormBody;

import java.util.List;

public class CartController {
    public static List<Product> list(int uid){
        String url = "/cart/list";
        FormBody.Builder param = new FormBody.Builder();
        param.add("uid", "" + uid);
        JSONObject body = PostUtils.postParam(url,param);
        JSONArray list = body.getJSONArray("data");
        return list.toJavaList(Product.class);
    }

    public static Cart add(Cart cart){
        String url = "/cart/add";
        String cartJson = JSON.toJSONString(cart);
        JSONObject body = PostUtils.postJson(url,cartJson);
        JSONObject data = body.getJSONObject("data");
        Cart cart1 = data.toJavaObject(Cart.class);
        return cart1;
    }

    public static int delete(int uid, int pid){
        String url = "/cart/deleteCart";
        FormBody.Builder param = new FormBody.Builder();
        param.add("uid", ""+ uid);
        param.add("pid", ""+ pid);
        JSONObject body = PostUtils.postParam(url,param);
        int res = body.getIntValue("data");
        return res;
    }
}
