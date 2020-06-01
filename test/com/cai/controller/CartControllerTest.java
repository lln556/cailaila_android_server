package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.Cart;
import com.cai.model.Product;
import com.cai.utils.PostUtils;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class CartControllerTest {
    Cart cart;

    @Before
    public void before(){
        cart = new Cart();
        cart.setPid(3);
        cart.setUid(3);
        cart.setNum(2);
    }

    @Test
    public void listCart() {
        int uid = 1;
        System.out.println("uid为"+uid+"的用户的购物车");
        List<Product> products = CartController.list(uid);
        for(Product product:products){
            System.out.println(product);
        }
    }

    @Test
    public void addCart() {
        System.out.printf("您插入的数据为");
        Cart cart1 = CartController.add(cart);
        System.out.printf(JSON.toJSONString(cart1));
    }

    @Test
    public void deleteCart() {
        boolean res = CartController.delete(3,3);
        System.out.println("是否删除指记录："+res);
    }
}