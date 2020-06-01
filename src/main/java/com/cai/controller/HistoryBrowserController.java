package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.model.HistoryBrowser;
import com.cai.utils.PostUtils;
import okhttp3.FormBody;

import java.util.List;

public class HistoryBrowserController {
    public static HistoryBrowser add(HistoryBrowser historyBrowser){
        String histortbrowseJSON = JSON.toJSONString(historyBrowser);
        String url = "/history/browser/add";
        JSONObject body = PostUtils.postJson(url , histortbrowseJSON);
        JSONObject data = body.getJSONObject("data");
        HistoryBrowser historyBrowser1 = data.toJavaObject(HistoryBrowser.class);
        return historyBrowser1;
    }

    /**
     * 查找某用户的浏览记录
     * @param uid 用户编号
     */
    public static List<HistoryBrowser> list(int uid){
        String url = "/history/browser/list";
        FormBody.Builder param = new FormBody.Builder();
        param.add("uid", ""+ uid);
        JSONObject body = PostUtils.postParam(url,param);
        JSONArray list = body.getJSONArray("data");
        List<HistoryBrowser> historyBrowsers = list.toJavaList(HistoryBrowser.class);
        return historyBrowsers;
    }
}
