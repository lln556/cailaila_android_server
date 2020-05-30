package com.cai.controller;

import com.cai.model.Product;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductControllerTest {

    @Test
    public void list() {
        List<Product> products = ProductController.list();
        System.out.println("查看所有商品：");
        for (Product product :
                products) {
            System.out.println(product);
        }

    }

    @Test
    public void filter() {
        System.out.println("根据关键字筛选：");
        List<Product> list1 = ProductController.filter("菜");
        for (Product pro :
                list1) {
            System.out.println(pro);
        }
        System.out.println("根据价格区间筛选：");
        List<Product> list2 = ProductController.filter(10, 20);
        for (Product pro :
                list2) {
            System.out.println(pro);
        }
    }


}