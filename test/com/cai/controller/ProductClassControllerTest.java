package com.cai.controller;

import com.cai.model.ProductClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductClassControllerTest {

    @Test
    public void list() {
        System.out.println("商品的分类：");
        List<ProductClass> classes = ProductClassController.list();
        for (ProductClass productClass:classes){
            System.out.println(productClass);
        }
    }
}