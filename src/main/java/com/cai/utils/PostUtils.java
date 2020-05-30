package com.cai.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cai.config.Config;
import okhttp3.*;

public class PostUtils {
    //    public static void
    public static JSONObject postJson(String url, String json) {
        String res = "";  // 结果
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, json);
        Request request = new Request.Builder()
                .url(Config.IP + url)
                .method("POST", body)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            res = responseBody;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(res);
    }

    public static JSONObject postParam(String url, FormBody.Builder param) {
        String res = "";  // 结果

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
//        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder()
                .url(Config.IP + url)
                .post(param.build())
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            res = responseBody;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(res);
    }
}
