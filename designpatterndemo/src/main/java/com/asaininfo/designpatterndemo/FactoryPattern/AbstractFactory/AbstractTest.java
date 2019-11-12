package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class AbstractTest {
    public static void main(String[] args) {
        MikeTeaShop mikeTeaShop = new PearlMikeTeaFactory();
        mikeTeaShop.orderMikeTea();

        mikeTeaShop = new CoconutMikeTeaFactory();
        mikeTeaShop.orderMikeTea();
    }
}
