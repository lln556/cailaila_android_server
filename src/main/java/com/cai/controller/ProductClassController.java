package com.cai.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.Product;
import com.cai.model.ProductClass;
import com.cai.utils.PostUtils;
import okhttp3.FormBody;

import java.util.List;

public class ProductClassController {
    public static List<ProductClass> list(){
        String url = "/product/class/list";
        JSONObject body = PostUtils.postJson(url,"");
        JSONArray list = body.getJSONArray("data");
        List<ProductClass> classes = list.toJavaList(ProductClass.class);
        return classes;
    }

    /**
     * 查看指定种类的所有商品
     * @param pcid  商品分类编号
     */
    public static List<Product> product(int pcid){
        String url = "/product/class/product";
        FormBody.Builder param = new FormBody.Builder();
        param.add("pcid", ""+ pcid);
        JSONObject body = PostUtils.postParam(url, param);
        JSONArray list = body.getJSONArray("data");
        List<Product> products = list.toJavaList(Product.class);
        return products;
    }
}
