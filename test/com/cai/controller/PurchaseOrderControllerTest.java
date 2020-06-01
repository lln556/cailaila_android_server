package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.cai.model.PurchaseOrder;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class PurchaseOrderControllerTest {
    PurchaseOrder purchaseOrder;

    @Before
    public void before(){
        purchaseOrder = new PurchaseOrder();
        purchaseOrder.setUid(1);
        purchaseOrder.setPid(2);
        purchaseOrder.setCurrentPrice((float) 32);
        purchaseOrder.setNum(3);
        purchaseOrder.setOrderTime(new Date());
    }

    @Test
    public void addOrder() {
        System.out.printf("您插入的订单为：" + JSON.toJSONString(PurchaseOrderController.add(purchaseOrder)));
    }
}