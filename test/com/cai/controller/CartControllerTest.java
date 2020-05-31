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
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class CartControllerTest {

    @Test
    public void listCart() {
        int uid = 1;
        System.out.printf("uid为"+uid+"的用户的购物车");
        List<Cart> cart1 = CartController.list(uid);
        for(Cart cart:cart1){
            System.out.println(cart);
        }
    }
}