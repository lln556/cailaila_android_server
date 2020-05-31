package com.cai.controller;

import com.cai.model.Product;
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

    @Test
    public void product() {
        System.out.println("蔬菜类的商品有：");
        List<Product> products = ProductClassController.product(1);
        for(Product product:products){
            System.out.println(product);
        }
    }
}