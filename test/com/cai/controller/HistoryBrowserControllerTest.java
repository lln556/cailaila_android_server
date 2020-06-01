package com.cai.controller;

import com.alibaba.fastjson.JSON;
import com.cai.model.HistoryBrowser;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HistoryBrowserControllerTest {
    HistoryBrowser historyBrowser;

    @Before
    public void before(){
        historyBrowser = new HistoryBrowser();
        historyBrowser.setUid(2);
        historyBrowser.setPid(2);
    }

    @Test
    public void add() {
        HistoryBrowser historyBrowser1 = HistoryBrowserController.add(historyBrowser);
        System.out.println("您插入的数据为："+ JSON.toJSONString(historyBrowser1));
    }

    @Test
    public void list() {
        List<HistoryBrowser> historyBrowsers = HistoryBrowserController.list(2);
        System.out.println("uid为2的用户的浏览记录：");
        for(HistoryBrowser historyBrowser:historyBrowsers){
            System.out.println(historyBrowser);
        }
    }
}