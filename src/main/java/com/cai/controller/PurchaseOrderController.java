package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.PurchaseOrder;
import com.cai.utils.PostUtils;

public class PurchaseOrderController {
    public static PurchaseOrder add(PurchaseOrder purchaseOrder){
        String url = "/purchase/order/add";
        String purchaseOrderJSON = JSON.toJSONString(purchaseOrder);
        JSONObject body = PostUtils.postJson(url,purchaseOrderJSON);
        JSONObject data = body.getJSONObject("data");
        PurchaseOrder purchaseOrder1 = data.toJavaObject(PurchaseOrder.class);
        return purchaseOrder1;
    }
}
