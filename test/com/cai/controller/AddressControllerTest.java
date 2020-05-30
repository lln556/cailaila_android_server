package com.cai.controller;

import com.cai.model.Address;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AddressControllerTest {
    Address address;

    @Before
    public void setUp() throws Exception {
       address = new Address();
       address.setAid(3);
       address.setUid(1);
       address.setAddrname("小王");
       address.setAddrtell("10086");
       address.setSheng("江苏");
       address.setShi("苏州");
       address.setQu("工业园区");
       address.setDetailaddr("白鹭园199号");
    }

    @Test
    public void list() {
        List<Address> list = AddressController.list(1);
        System.out.println("用户uid=1的收货地址:");
        for (Address addr :
                list) {
            System.out.println(addr);

        }
    }

    @Test
    public void update() {
        Address update = AddressController.update(address);
        System.out.println("更新后的地址为：" + address);
    }

    @Test
    public void add() {
        address.setAid(null);
        int add = AddressController.add(address);
        System.out.println("新增地址的uid为：" + add);
    }

    @Test
    public void delete() {
        boolean delete = AddressController.delete(4);
        System.out.println("是否删除指定地址：" + delete);
    }
}