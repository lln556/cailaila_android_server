package com.cai.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.ProductClass;
import com.cai.utils.PostUtils;

import java.util.List;

public class ProductClassController {
    public static List<ProductClass> list(){
        String url = "/product/class/list";
        JSONObject body = PostUtils.postJson(url,"");
        JSONArray list = body.getJSONArray("data");
        List<ProductClass> classes = list.toJavaList(ProductClass.class);
        return classes;
    }
}
